/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_pbo;

/**
 *
 * @author daanw
 */
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void addItem(Product product, int quantity) {
        cartItems.add(new CartItem(product, quantity));
    }

    public void removeItem(Product product) {
        cartItems.removeIf(item -> item.getProduct().equals(product));
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (CartItem item : cartItems) {
            total += item.calculateItemTotal();
        }
        return total;
    }
}
