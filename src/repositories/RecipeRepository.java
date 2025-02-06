package repositories;

import data.PostgresDB;
import models.Ingredient;
import models.Recipe;
import repositories.interfaces.IRecipeRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecipeRepository implements IRecipeRepository {
    @Override
    public List<Recipe> getRecipesByCategory(int categoryId) {
        List<Recipe> recipes = new ArrayList<>();
        String sql = "SELECT id, name, instructions FROM recipes WHERE category_id = ?";

        try (Connection conn = PostgresDB.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, categoryId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                recipes.add(new Recipe(
                        rs.getInt("id"),
                        rs.getString("name"),
                        categoryId,
                        rs.getString("instructions"),
                        new ArrayList<>() // Ingredients will be fetched separately in getRecipeById()
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return recipes;
    }

    @Override
    public Recipe getRecipeById(int recipeId) {
        String recipeSql = "SELECT id, name, category_id, instructions FROM recipes WHERE id = ?";
        String ingredientSql = "SELECT name, quantity FROM ingredients WHERE recipe_id = ?";

        try (Connection conn = PostgresDB.getInstance().getConnection();
             PreparedStatement recipeStmt = conn.prepareStatement(recipeSql);
             PreparedStatement ingredientStmt = conn.prepareStatement(ingredientSql)) {

            recipeStmt.setInt(1, recipeId);
            ResultSet recipeRs = recipeStmt.executeQuery();

            if (recipeRs.next()) {
                int id = recipeRs.getInt("id");
                String name = recipeRs.getString("name");
                int categoryId = recipeRs.getInt("category_id");
                String instructions = recipeRs.getString("instructions");

                // Fetch ingredients
                List<Ingredient> ingredients = new ArrayList<>();
                ingredientStmt.setInt(1, recipeId);
                ResultSet ingredientRs = ingredientStmt.executeQuery();
                while (ingredientRs.next()) {
                    ingredients.add(new Ingredient(
                            ingredientRs.getString("name"),
                            ingredientRs.getInt("quantity")
                    ));
                }

                return new Recipe(id, name, categoryId, instructions, ingredients);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Ingredient> getIngredientsByRecipeId(int recipeId) {
        return List.of();
    }
}
