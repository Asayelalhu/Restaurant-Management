/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uqu.cs;

import java.util.Scanner;

public class Customer extends User{
   private String phoneNumber;
    private String address;
    private Bill customerBill;

    
public Customer (){
    super();
    phoneNumber="05";
    address="";
     customerBill = new Bill(); // to create new empty Bill
}
public Customer (String uName,String uEmail,String uPassword,String CPhoneNumber,String CAddress){
 super(uName,uEmail,uPassword);
this.phoneNumber=CPhoneNumber;
this.address=CAddress;
customerBill = new Bill();
}  
// Setters &Getters
    public void setPhoneNumber(String CPhoneNumber){
        this.phoneNumber=CPhoneNumber;
    }
    public String getphoneNumber(){
        return phoneNumber;
    }
    public void setAddress(String CAddress){
        this.address=CAddress;
    }
    public String getAddress(){
        return address;
    }
     public Bill getCustomerBill() {
        return customerBill;
    }

    public void setCustomerBill(Bill customerBill) {
        this.customerBill = customerBill;
    }
    
 /**
  * print the dashboard of  'customer' to select one operation
  * @post 'customer' can be able to see the dashboard 
  */
   
    public void printCustomerDashboard(){
        System.out.println("-----< Cutomer Dashboard >-----");
        System.out.println("1. Add dish to table");
        System.out.println("2. Show bill and pay");
        System.out.println("3. Exit");
    }
   
   /**
     *
     * Add the dish that customer selected to the customerBill 
     *  
     * @param menu is the menu that contains all restaurant dishes 
     * @post new dish has been added to the customerBill
     * 
     */
    
     public void addDishToTable(Menu menu) {
            Scanner keyboard = new Scanner(System.in);
                try{
           menu.showMenu();
            System.out.println("Enter number of dish to be added: ");
            int numOfDish = keyboard.nextInt();

            Dish selectedDish = menu.getMenuDishes().get(numOfDish); // it will return object of Dish
            customerBill.addDishToBill(selectedDish);
        }catch(Exception e){
            System.out.println("Input Exception!!");
        }
}
   /**
     * To make the 'Customer' able to login to the system
     *
     * @return
     * @pre the 'Customer' is not logged in yet
     * @post the 'Customer' is logged in actually
     */
     public static String loginCustomer () {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your Email : ");
        String userEmail = keyboard.nextLine();
        System.out.println("Enter your Password : ");
        String userPassword = keyboard.next();
        return userEmail+","+userPassword; 
    
   
    }
/** to check the information the customer enter
     */ 
   @Override
     public void againPassword(String userPassword) { 
        Scanner keyboard = new Scanner(System.in); 
        
        System.out.println("Enter your password again : "); 
        String passwordAgain = keyboard.next();
        
        boolean isMatched = false; 
        do { 
            if (userPassword.equals(passwordAgain)) { 
                isMatched = true; 
            }else{ 
                System.err.println("The passwords or the email DON'T match!"); 
                System.out.println("Please write the password again: "); 
                passwordAgain = keyboard.next(); 
            } 
        } while (isMatched == false);
        
    }   
  
     /**
      * This method asks the new customer to enter his data to make an account
      * @return
      * @post the customer will be signed in the system
      */
     
    public String signUpCustomer(){
         Scanner keyboard=new Scanner (System.in);
         String cusData = "";
        try{
        System.out.println("Please enter your informations : ");
        System.out.println("Your Name : ");
        String name=keyboard.nextLine();
        System.out.println("Your Email : ");
        String email=keyboard.nextLine();
        System.out.println("Your Address : ");
        String address=keyboard.nextLine();
        System.out.println("Your Phone Number : ");
        String phoneNum=keyboard.nextLine();
        System.out.println("Your Password : ");
        String password=keyboard.next(); 
        againPassword(password);
        
        System.out.println("Hello "+name);
        
            cusData = (name + "," + email + "," + address + "," + phoneNum + "," + password);
    }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return cusData;
    }

    

       
       @Override
    public String toString (){ 
        return ("Customer phone number is : "+phoneNumber + "Customer address is : "+address +" Customer bill is : "+customerBill);
    } 
       
    }
    

