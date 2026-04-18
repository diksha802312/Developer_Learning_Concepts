package org.example.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Item shoe = new Item("Shoe", 10.0);
        Item watch = new Item("Watch", 20.0);
        Item shirt = new Item("Shirt", 30.0);
        Item wine = new Item("Wine", 40.0);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(shoe, 2);
        shoppingCart.addItem(watch, 3);
        shoppingCart.addItem(shirt, 5);
        shoppingCart.addItem(wine, 6);

        shoppingCart.displayCart();

        shoppingCart.removeItem(shoe, 1);
        shoppingCart.removeItem(shirt, 6);
        shoppingCart.displayCart();

        shoppingCart.clear();
        shoppingCart.displayCart();

    }
}
