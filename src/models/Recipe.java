package models;

import java.util.List;

public class Recipe {
    private int id;
    private String name;
    private int categoryId;
    private List<Ingredients> ingredients;
    private String instructions;

    public Recipe() {}

    public Recipe(int id, String name, List<Ingredients> ingredients, String instructions) {
        setId(id);
        setName(name);
        setIngredients(ingredients);
        setInstructions(instructions);
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

    public List<Ingredients> getIngredients() {
        return ingredients;
    }
    public void setIngredients(List<Ingredients> ingredients) {
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
