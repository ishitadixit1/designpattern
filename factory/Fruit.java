package factory;

public class Fruit implements GroceryInterface {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Fruit: " + name);
    }
}

