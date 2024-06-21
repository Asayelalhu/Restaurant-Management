### Restaurant Management System - Admin Module

#### Overview
This Java program simulates an admin module for a restaurant management system, offering functionalities for menu management, customer interactions, and secure access control.

#### Features
- **Admin Login**: Authenticate using predefined credentials (`admin@hotmail.com`, `2023`), with additional key password verification.
- **Customer Registration**: New customers can sign up by providing their details.
- **Menu Management**: Admins can add new dishes to the restaurant menu dynamically.
- **Customer Interaction**: Customers can log in, add dishes to their table, view their bill, and choose a payment method.
- **Customer Allergies**: Customers are prompted about allergies to ensure safe food selection.
- **Persistent Data Storage**: Customer information is stored in `cusDataFile.txt` for login and registration purposes.

#### Usage
1. **Setup:**
   - Compile: `javac Main.java`
   - Run: `java Main`
   
2. **Admin Functions:**
   - Admins can log in, add new dishes to the menu, view all customer information, and exit the system.

3. **Customer Functions:**
   - Customers can log in, add dishes to their table from the menu, view and pay their bill, and exit.

#### File Structure
- `Main.java`: Main entry point and control logic of the application.
- `Admin.java`: Admin-specific functionalities and data handling.
- `Customer.java`: Customer-specific data and operations.
- `Menu.java`: Menu management including adding new dishes and displaying the menu.
- `Dish.java`: Class representing individual dishes with name and price.
- `Bill.java`: Handles customer billing, including itemized orders and total price.
- `cusDataFile.txt`: Text file storing customer registration data.

#### Developer
- Developed by [Asayel ALhuthali]

#### Notes
- Ensure `cusDataFile.txt` is accessible and contains valid customer data.
- Java Runtime Environment (JRE) is required to execute the application.

---
