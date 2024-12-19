/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_pbo;

/**
 *
 * @author daanw
 */
public class Product {
    public int Productid;
    public String Name;
    public double Price;
    public int Stock;
    public int quantity;
    public boolean bertambah;

    public Product(int Productid, String Name, double Price, int Stock) {
        this.Productid = Productid;
        this.Name = Name;
        this.Price = Price;
        this.Stock = Stock;
    }
    
    public void setProductid(int Productid) {
        this.Productid = Productid;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getProductid() {
        return Productid;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public int getStock() {
        return Stock;
    }
    
    public void updateStock(int quantity, boolean bertambah) {
        if (bertambah) {
            Stock += quantity;
            System.out.println("Menamahkan stock product sejumlah " + quantity + ". Stock sekarang: " + Stock);
        } else {
            if (quantity <= Stock) {
                Stock -= quantity; 
                System.out.println("Stock berkurang sebanyak " + quantity + ".Stock Sekarang: " + Stock);
            } else {
                System.out.println("Error: Tidak Terdapat cukup stock untuk di kurangi.");
            }
        }
    }
    
    public void DisplayInfo() {
        System.out.println("Product ID: " + Productid);
        System.out.println("Name: " + Name);
        System.out.println("Price: $" + Price);
        System.out.println("Stock: " + Stock + " units");
    }
}
