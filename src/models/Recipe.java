package models;

import java.util.Map;

public class Recipe {
    private int id;
    private String name;
    private int categoryId;
    private Map<String, Integer> ingredients;
    private String instructions;

    public Recipe() {}

    public Recipe(int id, String name, Map<String, Integer> ingredients, String instructions) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.instructions = instructions;
        this.ingredients = ingredients;
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

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }
    public void setIngredients(Map<String, Integer> ingredients) {
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
