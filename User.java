/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uqu.cs;

import java.util.*;

public class User {
   private String name;
    private String email;
    private String password;
    //constructor
    public User(){
      name="No name yet";
      email="No email yet";
      password="";
    }
    public User(String uName, String uEmail,String uPassword){
        this.name=uName;
        this.email=uEmail;
        this.password=uPassword;
    }
   //Setters&Getters
    public void setName(String uName){
        this.name=uName;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String uEmail){
        this.email=uEmail;
    }
    public String getEmail(){
        return email;
    }
    public void setPassword(String uPassword){
        this.password=uPassword;
    }
    public String getPassword(){
        return password;
    }

    /**
    * Check the password that user entered at the first time matches that 
     * entered at second time 
     * 
     * @param userPassword is the password that user entered at the first time 
     * @pre 
     * 
     */ 
    
    public void againPassword(String userPassword) { 
        Scanner keyboard = new Scanner(System.in); 
         
        System.out.println("Enter your password again : "); 
        String passwordAgain = keyboard.next(); 
 
        boolean isMatched = false; 
        do { 
            if (userPassword.equals(passwordAgain)) { 
                isMatched = true; 
            }else{ 
                System.err.println("The passwords DON'T match!"); 
                System.out.println("Please try again: "); 
                passwordAgain = keyboard.next(); 
            } 
        } while (isMatched == false); 
         
    }
    @Override
    public String toString (){
        return ("User name is : "+name + "User email is : "+email +"\n User password is : "+password);
    }
}
    
