package repositories.interfaces;

import models.Ingredient;
import models.Recipe;
import java.util.List;

public interface IRecipeRepository {
    List<Recipe> getRecipesByCategory(int categoryId);
    Recipe getRecipeById(int recipeId);

    List<Ingredient> getIngredientsByRecipeId(int recipeId);
}
