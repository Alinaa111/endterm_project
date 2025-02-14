package controllers.interfaces;


public interface IRecipeController {
    void displayRecipesByCategory(int categoryId);

    void displayRecipeDetails(int recipeId, int portions);
}
