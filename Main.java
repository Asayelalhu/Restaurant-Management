package edu.uqu.cs;
import java.io.*;
import java.util.*;

public class Main{
	public static void main (String[] args){
            Scanner keyboard = new Scanner(System.in);
        System.out.println(" -----[ Welcome to Roma Restaurant ]-----");

      Admin admin = new Admin("Asayel", "admin@hotmail.com", "2023", "0000"); 
      Customer cus=new Customer ("Aliyah","Al@gmail.com","123","0555","macca");
      Menu ourDishes = new Menu(); 

       // here we create resturant Menu that contain ArrayList of Dish
       
        Dish item0 = new Dish("Ranch Pizza", 65);
        Dish item1 = new Dish("Risotto", 60);
        Dish item2 = new Dish("Italian pasta", 70);
        Dish item3 = new Dish("Lazanya", 59);// Main dishes
        Dish item4 = new Dish("Tiramisu", 32);
        Dish item5 = new Dish("Granita", 28);
        Dish item6 = new Dish("Cassata", 25);// desserts
        Dish item7 = new Dish("Coca-Cola", 10);
        Dish item8 = new Dish("Sprite", 8);
        Dish item9 = new Dish("Orange juice", 7);
        Dish item10 = new Dish("Strawberry juice", 6);// Drinks
  
        ourDishes.getMenuDishes().add(item0);
        ourDishes.getMenuDishes().add(item1);
        ourDishes.getMenuDishes().add(item2);
        ourDishes.getMenuDishes().add(item3);
        ourDishes.getMenuDishes().add(item4);
        ourDishes.getMenuDishes().add(item5);
        ourDishes.getMenuDishes().add(item6);
        ourDishes.getMenuDishes().add(item7);
        ourDishes.getMenuDishes().add(item8);
        ourDishes.getMenuDishes().add(item9);
        ourDishes.getMenuDishes().add(item10);
        
     
        do {
            System.out.println("-----< Registration Screen >-----");
            System.out.println("Enter 1 to Login");
            System.out.println("Enter 2 to Sign up");
            System.out.println("Enter 3 to Exit");

            int Choice = keyboard.nextInt();
            if (Choice == 1) {
            boolean successLogin = false;
         do {
                    System.out.println("Are you an 'admin' or a 'customer' ?");
                    String answer = keyboard.next();

                    if(answer.equalsIgnoreCase("Admin")) {
                        successLogin = admin.loginAdmin();// check if he is real Admin or not
                        if(successLogin == true) {
                            int adminOperation;
                            do {
                                admin.printAdminDashboard(); // Print Admin Dashboard
                                keyboard.nextLine();
                                adminOperation = keyboard.nextInt();

                            
                        switch (adminOperation) {
                                    case 1:
                                        ourDishes.addNewDish();
                                        break;
                                    case 2:
                                        admin.viewAllCustomer();
                                        break;
                                
                                    case 3:
                                        System.out.println("< Return to registration screen.");
                                        break;
                                    default:
                                        System.err.println("Error.. Please enter ONLY one of previous choices!");
                                }
                          } while (adminOperation != 3);
                        }
                    }else if(answer.equalsIgnoreCase("customer")) {
                    String dataLogin = Customer.loginCustomer();
                    String cusData = checkCustomerData(dataLogin);
                        
                        if (cusData != null) {
                            String[] data = cusData.split(",");
                            Customer foundCustomer = new Customer(data[0], data[1], data[2], data[3], data[4]);

                            successLogin = true;
                            int customerOperation;
                            do {
                                foundCustomer.printCustomerDashboard(); // Print Customer Dashboard

                                customerOperation = keyboard.nextInt();
                                switch (customerOperation) {
                                    case 1:
                                        foundCustomer.addDishToTable(ourDishes);
                                        break;
                                    case 2:

                                        foundCustomer.getCustomerBill().Payment();
                                        break;
                                    case 3:
                                        System.out.println("< Return to registration screen.");
                                        break;
                                    default:
                                        System.err.println("Error.. Please enter ONLY one of previous choices!");
                                }
                            } while (customerOperation != 3);
                        }
                    } else {
                        System.out.println("Please enter ONLY one of them !");
                    }
                    if(successLogin == false) {
                        System.err.println("invalid information!!, please try again..");
                    }
                }while(!successLogin);

            }else if(Choice == 2) {
                String cusData = cus.signUpCustomer();
                saveCustomerData(cusData);
                Menu.allergies();
            }else if(Choice == 3) {
                System.out.println("Thank you so much for visiting our restaurant we hope you like it! ");
                System.exit(0);
            }

        } while (true);
    }
    /**
     * This method store customer’s login data in the program file.
     * @param signupData
     */
    public static void saveCustomerData(String signupData){
        File filePath = new File("cusDataFile.txt"); 
        try{
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(filePath, true)); // to make append
            outputStream.println(signupData);
            outputStream.close();
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    /**
     * To verify the validity of the data entered by the customer in the login process through the file in which his data is saved.
     * @param loginData
     * @return
     */
 public static String checkCustomerData(String loginData){
        String[] cusData = loginData.split(","); // customer@email,pass
        String emailCus = cusData[0];
        String passCus = cusData[1];
        
        File filePath = new File("cusDataFile.txt"); 
        try{
            Scanner inputStream = new Scanner(filePath);
            while(inputStream.hasNextLine()){
                String lineData = inputStream.nextLine();
                String[] data = lineData.split(",");
                String email = data[1];
                String pass = data[4];
                
                if(email.equals(emailCus) && pass.equals(passCus)){
                    return lineData;
                }
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return null;
    }

}
