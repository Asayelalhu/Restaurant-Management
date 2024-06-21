/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uqu.cs;

import java.util.*;
/**
 */
public class Bill {
    private double totalPrice;
    private ArrayList<Dish> orders;  
    // constructor
    public Bill(){
        totalPrice=0.0;
        orders = new ArrayList();
}
    
    public Bill (double price , ArrayList item ){
        this.totalPrice=price;
        this.orders=item;
        orders = new ArrayList();
    }
    
    //Setters&Getters
    public void setTotalPrice(double total){ 
        this.totalPrice=total;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    public void setOrders(ArrayList<Dish> item){
        this.orders=item;
    }
    public ArrayList<Dish> getOrders(){
        return orders;
    }
    
     public void addDishToBill(Dish selectedDish) {
        orders.add(selectedDish);
    }
     /**
     * Show all Bill contents "dishes info" like (dish name, dish price)
     * 
     * @pre 
     * @post customer bill has been printed
     */
     public void printBill() {
        System.out.println("-----< Cutomer Bill >-----");
        for(int i = 0; i < orders.size(); i++){
            System.out.println(orders.get(i).toString());
            totalPrice += orders.get(i).getDishPrice();
        }
        System.out.println("--------------------------");
        System.out.println("Total Price is: " + this.totalPrice);
    }
/**
 * TO Make customer pay the bill after print it
 * @Pre
 * @post the bill has been payed 
 */
 public void Payment (){
         Scanner keyboard=new Scanner (System.in);
 printBill();
System.out.println("Choose the payment method that suits you");
System.out.println("Cash or Credit Card? ");
String payments =keyboard.nextLine();

      if (payments.equalsIgnoreCase("Cash")){
         System.out.println("Show the Cash ");
         }

      else if (payments.equalsIgnoreCase("Credit card")){
            System.out.println("Show Credit card");
        }
      
      else{
            do{
         System.out.println("Please enter just one of them  !");
         String payment2 =keyboard.nextLine();
          if (payment2.equalsIgnoreCase("Cash")){
            System.out.println("Show the Cash ");
          break;}
            else if (payment2.equalsIgnoreCase("Credit Card")){
            System.out.println("Show Credit card");
            break;
          }
              }
   while (!(payments.equalsIgnoreCase("Cash"))&&!(payments.equalsIgnoreCase("Credit card"))) ;
      
   }
 

 }
 @Override
    public String toString() {
        return "The total price is " + totalPrice;}
}
