/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uqu.cs;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu  {
  private ArrayList<Dish> menuDishes;
   // constructor
    public Menu(){
         this.menuDishes = new ArrayList(); // it create empty ArrayList of Dish
    }
    public Menu(ArrayList<Dish> dishes){
        this.menuDishes = dishes;

    }public ArrayList<Dish> getMenuDishes() {
        return menuDishes;
    }
    
    public void setMenuDishes(ArrayList<Dish> menuDishes) {
        this.menuDishes = menuDishes;
    }
  /**
     * Add new dish to restaurant menu
     * 
     * @post new dish has been added to the restaurant menu
     */
     public void addNewDish(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter dish name: ");
        String dName = keyboard.nextLine();
        System.out.println("Enter dish price: ");
        double dPrice = keyboard.nextDouble();
        
        Dish newDish = new Dish(dName, dPrice);
        menuDishes.add(newDish);
    }
    
/**
     * Show all contents (dishes) in restaurant menu
     *
     * @post it will show all restaurant dishes
     */
      public void showMenu() {
        System.out.println("-----< Resturant Menu >-----");
        System.out.println("Dish Name                || Price");
        for (int i = 0; i < menuDishes.size(); i++) {
            System.out.println(i + ") " + menuDishes.get(i).toString());
        }
    }
     /**
     * Asking the customer about the possibility of having an allergy to some foods
     * 
     * @post customer has been asked about allergy
     */
       public static void allergies(){
            Scanner keyboard=new Scanner (System.in);

        System.out.println("Are you allergic to legumes or wheat ? (Yes / No) ");
        String answer=keyboard.next();
        if(answer.equalsIgnoreCase("Yes")){
            System.out.println("Be careful in choosing your order ! as there some products that contain these ingredients and strawberries also ");
        }
        else {
            System.out.println("Are you allergic to strawberries ? (Yes / No) ");
             String answer2=keyboard.next();
            if(answer2.equalsIgnoreCase("Yes")){
                System.out.println("Please choose your desserts carefully ! some desserts contain strawberries ");
            }
            else{
            System.out.println("Welcome to our restaurant ");
                }

             }

    
     }
     @Override
     public String toString (){ 
         return ("The number of menu dishes is : "+menuDishes.size());
     }
}
