package models;

public class Ingredient {
    private int id;
    private String name;
    private int quantity;
    private String unit;

    public Ingredient() {}

    public Ingredient(int id, String name, int quantity, String unit) {
        setId(id);
        setName(name);
        setQuantity(quantity);
        setUnit(unit);
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Ingredients [id: " + id + ", name: " + name + ", quantity: " + quantity + ", unit: " + unit + "]";
    }
}
