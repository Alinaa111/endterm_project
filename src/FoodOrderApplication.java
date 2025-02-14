import controllers.RecipeController;

import java.util.Scanner;

public class FoodOrderApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeController recipeController = new RecipeController();

        System.out.println("Welcome to the Food Order Application!");

        while (true) {
            System.out.println("\nChoose a category:");
            System.out.println("1. Entree (Soups)");
            System.out.println("2. Second Dishes");
            System.out.println("3. Drinks");
            System.out.println("4. Desserts");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int categoryChoice = scanner.nextInt();

            if (categoryChoice == 5) {
                System.out.println("Thank you for using the Food Order Application. Goodbye!");
                break;
            }

            recipeController.displayRecipesByCategory(categoryChoice);

            System.out.print("\nChoose a recipe (Enter ID): ");
            int recipeChoice = scanner.nextInt();

            System.out.print("For how many portions? ");
            int portions = scanner.nextInt();

            recipeController.displayRecipeDetails(recipeChoice, portions);

            System.out.print("\nWould you like to view another recipe? (yes/no): ");
            scanner.nextLine();
            String continueChoice = scanner.nextLine().trim().toLowerCase();

            if (("no".equalsIgnoreCase(continueChoice))) {
                System.out.println("Thank you for using the Food Order Application. Goodbye!");
                System.out.println("P.S. Nanmen zhe toyasyn");
                break;
            }
        }

        scanner.close();
    }
}