package org.example.ShoppingCart;

public class CartItem {
    private Item item;
    private int quantity;

    public CartItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void incrementQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void decrementQuantity(int quantity) {
        this.quantity -= quantity;
    }

    public double calculatePrice(){
        return item.getPrice() * quantity;
    }
}
