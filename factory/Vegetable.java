package factory;

public class Vegetable implements GroceryInterface {
    private String name;

    public Vegetable(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Vegetable: " + name);
    }
}
