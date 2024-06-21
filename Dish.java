/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uqu.cs;

public class Dish{
    private String dishName;
    private double dishPrice;
    
    public Dish() {
        dishName = "No name yet";
        dishPrice = 0.0;
    }
    public Dish(String itemName, double itemPrice) {
        this.dishName = itemName;
        this.dishPrice = itemPrice;
    }

    // Setters & Getters
    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }
    
    @Override
    public String toString() {
        return "Dish Name: " + dishName + ", Price = " + dishPrice;
    }
}


