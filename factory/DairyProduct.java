package factory;

public class DairyProduct implements GroceryInterface {
    private String name;

    public DairyProduct(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Dairy Product: " + name);
    }
}

