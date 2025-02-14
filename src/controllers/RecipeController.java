package controllers;

import models.Ingredient;
import models.Recipe;
import repositories.RecipeRepository;
import controllers.interfaces.IRecipeController;

import java.util.List;

public class RecipeController implements IRecipeController {
    private RecipeRepository recipeRepo = new RecipeRepository();

    @Override
    public void displayRecipesByCategory(int categoryId) {
        List<Recipe> recipes = recipeRepo.getRecipesByCategory(categoryId);
        if (recipes.isEmpty()) {
            System.out.println("No recipes found for this category.");
            return;
        }

        System.out.println("Available Recipes:");
        recipes.forEach(recipe -> System.out.println(recipe.getId() + ". " + recipe.getName()));
    }

    @Override
    public void displayRecipeByCategory(int categoryId) {

    }

    @Override
    public void displayRecipeDetails(int recipeId, int portions) {
        Recipe recipe = recipeRepo.getRecipeById(recipeId);
        if (recipe == null) {
            System.out.println("Recipe not found!");
            return;
        }

        int totalPrice = recipe.getPrice() * portions;
        System.out.println("\nRecipe: " + recipe.getName());
        System.out.println("Instructions: " + recipe.getInstructions());
        System.out.println("Ingredients for " + portions + " portion(s):");

        for (Ingredient ingredient : recipe.getIngredients()) {
            int scaledQuantity = ingredient.getQuantity() * portions;
            System.out.println("- " + ingredient.getName() + ": " + scaledQuantity);
        }

        System.out.println("Price for " + portions + " portions: " + totalPrice + " KZT");

    }
}
