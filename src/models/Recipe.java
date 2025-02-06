package models;

import java.util.List;

public class Recipe {
    private int id;
    private String name;
    private int categoryId;
    private String instructions;
    private List<Ingredient> ingredients;


    public Recipe() {}

    public Recipe(int id, String name, int categoryId, String instructions, List<Ingredient> ingredients) {
        setId(id);
        setName(name);
        setCategoryId(categoryId);
        setInstructions(instructions);
        setIngredients(ingredients);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Recipe [id: " + id + ", name: " + name + ", ingredients: " + ingredients + ", instructions: " + instructions + "]";
    }
}
