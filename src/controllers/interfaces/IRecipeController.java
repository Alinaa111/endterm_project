package controllers.interfaces;

import models.Recipe;

public interface IRecipeController {
    void displayRecipeByCategory(int categoryId);
    void displayRecipeDetails(int recipeId, int portions);
}
