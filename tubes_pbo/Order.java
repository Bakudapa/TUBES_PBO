package com.mycompany.tubes_pbo;

import java.util.Date;

public abstract class Order {
    protected int orderId;
    protected Date orderDate;
    protected double totalPrice;
    protected Customer customer;
    protected ShoppingCart shoppingCart;

    public Order(int orderId, SDate orderDate, Customer customer, ShoppingCart shoppingCart) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customer = customer;
        this.shoppingCart = shoppingCart;
    }

    public int getOrderId() {
        return orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public abstract double calculateTotal();

    public abstract void generateInvoice();
    
    public abstract int getEstimateDeliveryTime();  
}
