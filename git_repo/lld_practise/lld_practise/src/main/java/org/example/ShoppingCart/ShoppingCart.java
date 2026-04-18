package org.example.ShoppingCart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, CartItem> itemMap = new HashMap<>();

    public void addItem(Item item, int quantity) {
        if(itemMap.containsKey(item.getName())) {
            itemMap.get(item.getName()).incrementQuantity(quantity);
        }
        else {
            itemMap.put(item.getName(), new CartItem(item, quantity));
        }
    }

    public void removeItem(Item item, int quantity) {
        if(!itemMap.containsKey(item.getName())) {
            System.out.println("Item " + item.getName() + " not found");
        }
        else{
            if(quantity >= itemMap.get(item.getName()).getQuantity()) {
                itemMap.remove(item.getName());
            }
            else{
                itemMap.get(item.getName()).decrementQuantity(quantity);
            }
        }
    }

    public void clear(){
        itemMap.clear();
    }

    public void displayCart(){
        if(itemMap.isEmpty()){
            System.out.println("No item found in cart");
        }
        for(Map.Entry<String,CartItem> entry: itemMap.entrySet()) {
            System.out.println("item " + entry.getKey() + " has quantity " + entry.getValue().getQuantity() + " total price " + entry.getValue().calculatePrice());
        }
        System.out.println("Amount to be paid " + getPrice());
        System.out.println("\n");

    }

    public double getPrice(){
        double totalPrice = 0.0;
        for(CartItem cartItem : itemMap.values()) {
            totalPrice += cartItem.calculatePrice();
        }
        return totalPrice;
    }

}
