package controllers.interfaces;

import models.Recipe;

public interface IRecipeController {
    void displayRecipesByCategory(int categoryId);

    void displayRecipeByCategory(int categoryId);
    void displayRecipeDetails(int recipeId, int portions);
}
