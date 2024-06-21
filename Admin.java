/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uqu.cs;

import java.io.File;
import java.util.Scanner;

public class Admin extends User {
  private static String keyPassword;
    
     Scanner keyboard=new Scanner (System.in);
//constructor
    public Admin (){
        super();
        keyPassword="";
    }
    public Admin (String uName,String uEmail,String uPassword, String AKeyPassword){
    super(uName,uEmail,uPassword);
    keyPassword=AKeyPassword;
}
    public void setKeypassword(String AKeyPassword){
        this.keyPassword=AKeyPassword;
    }
    public String getKeyPassword(){
        return keyPassword;
    }
    
         /**
     * Print the dashboard of 'admin' to select one operation
     * 
     * @post 'admin' can be able to see the dashboard
     */
  
     public void printAdminDashboard(){
        System.out.println("-----< Admin Dashboard >-----");
        System.out.println("1. Add new dish to menu");
        System.out.println("2. View all cutomers info");
        System.out.println("3. Exit");
    }
     
     /**
     * To make 'Admin' able to login to the system
     *
     * @return
     * @pre the 'Admin' is not logged in yet
     * @post the 'Admin' is logged in actually
     */
     public boolean loginAdmin() {

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your Email : ");
        String adminEmail = keyboard.nextLine();
        System.out.println("Enter your Password : ");
        String adminPassword = keyboard.nextLine();

        if (adminEmail.equals("admin@hotmail.com") && adminPassword.equals("2023")) { // if user data match this data that meas the user is Admin
            againPassword(adminPassword);
        }
        return true;
    
      }
      /**
       * This method allows entering the password for a second time to verify the user data
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
                System.err.println("The passwords DON'T match!"); 
                System.out.println("Please try again: "); 
                passwordAgain = keyboard.next(); 
            } 
        } while (isMatched == false); 
        
        System.out.println("please enter the key Password, and be careful you have 3 attempts only :");
         String keyPassword2 = keyboard.next();
            
          
             if(keyPassword2.equals(keyPassword)){
                System.out.println("Hello Admin");
            }else{
                System.out.println("incorrect key password, please try again : "); 
                String keyPassword3 = keyboard.next();
                if(keyPassword3.equals(keyPassword)){
                System.out.println("Hello Admin");
                }else{
                System.out.println("incorrect key password, please try again : "); 
                String keyPassword4 = keyboard.next();
                 if(keyPassword4.equals(keyPassword)){
                System.out.println("Hello Admin");
                }else{
                     System.out.println("incorrect key password, please try onther time. \nTHANK YOU\n "); 
                     System.exit(0);
                 }
                }
             }
        
           
    }
  /**
     * Display all restaurant customers in list
     *
     * @post 'admin' will be able to see all customers
     */
     public void viewAllCustomer(){
        File filePath = new File("cusDataFile.txt");
        
        try{
            Scanner inputStream = new Scanner(filePath);
            
            while(inputStream.hasNextLine()){
                System.out.println("Customer Info => { " + inputStream.nextLine() + " }");
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
       
    }
    @Override
       public String toString (){
        return ( "Admin email is : admin@hotmail.com"+"\n Admin password is : 2023"+"\n Admin Keypassword is : "+keyPassword);
    }
}
    
    
