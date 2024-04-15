package factory;

public class Main {
    public static void main(String[] args) {
        GroceryFactory groceryFactory = new GroceryFactory();

        // Creating and displaying different groceries
        GroceryInterface fruit = groceryFactory.createGrocery("FRUIT", "Apple");
        fruit.display();

        GroceryInterface vegetable = groceryFactory.createGrocery("VEGETABLE", "Carrot");
        vegetable.display();

        GroceryInterface dairyProduct = groceryFactory.createGrocery("DAIRY", "Milk");
        dairyProduct.display();
    }
}

