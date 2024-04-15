package factory;

public class GroceryFactory {
    public GroceryInterface createGrocery(String type, String name) {
        switch (type.toUpperCase()) {
            case "FRUIT":
                return new Fruit(name);
            case "VEGETABLE":
                return new Vegetable(name);
            case "DAIRY":
                return new DairyProduct(name);
            default:
                return null;
        }
    }
}

