/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_pbo;

/**
 *
 * @author daanw
 */
public class RegularOrder extends Order {
    private double regularDeliveryFee;

    public RegularOrder(int orderId, Date orderDate, Customer customer, ShoppingCart shoppingCart, double regularDeliveryFee) {
        super(orderId, orderDate, customer, shoppingCart);
        this.regularDeliveryFee = regularDeliveryFee;
    }

    @Override
    public double calculateTotal() {
        this.totalPrice = shoppingCart.calculateTotalPrice() + regularDeliveryFee;
        return totalPrice;
    }

    @Override
    public void generateInvoice() {
        System.out.println("Regular Order Invoice");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Total Price: $" + totalPrice);
    }
    
    @Override
    public int getEstimateDeliveryTime() {
        return estimateDeliveryTime; 
    }
}

