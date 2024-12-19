/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_pbo;

/**
 *
 * @author daanw
 */
public class ExpressOrder extends Order {
    private double expressDeliveryFee;

    public ExpressOrder(int orderId, Date orderDate, Customer customer, ShoppingCart shoppingCart, double expressDeliveryFee) {
        super(orderId, orderDate, customer, shoppingCart);
        this.expressDeliveryFee = expressDeliveryFee;
    }

    @Override
    public double calculateTotal() {
        this.totalPrice = shoppingCart.calculateTotalPrice() + expressDeliveryFee;
        return totalPrice;
    }

    @Override
    public void generateInvoice() {
        System.out.println("Express Order Invoice");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Total Price: $" + totalPrice);
    }
    
    @Override
    public int getEstimateDeliveryTime() {
        return estimateDeliveryTime; 
}

