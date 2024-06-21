---
# Restaurant Management System.

## Overview
This Java program implements an administrative module for a restaurant management system using Object-Oriented Programming (OOP) principles. It facilitates menu management, customer interaction, and ensures secure access and data handling.

## Features
- **Admin Login**: Authenticate using predefined credentials (`admin@hotmail.com`, `2023`), with additional key password verification.
- **Customer Registration**: New customers can sign up by providing their details.
- **Menu Management**: Admins can add new dishes to the restaurant menu dynamically.
- **Customer Interaction**: Customers can log in, add dishes to their table, view their bill, and choose a payment method.
- **Customer Allergies**: Customers are prompted about allergies to ensure safe food selection.
- **Persistent Data Storage**: Customer information is stored in `cusDataFile.txt` for login and registration purposes.

## Object-Oriented Design
- **Classes**: The system is structured into classes such as `Admin`, `Customer`, `Menu`, `Dish`, and `Bill`, each encapsulating specific functionalities and data related to its role.

- **Inheritance and Composition**: Classes like `Admin` and `Customer` inherit from a base `User` class, promoting code reuse and maintaining a consistent user interface.

- **Encapsulation**: Data members of classes are private, accessible through public methods, ensuring data integrity and modularity.
## Usage
1. **Setup:**
   - Compile: `javac Main.java`
   - Run: `java Main`
   
2. **Admin Functions:**
   - Admins can log in, add new dishes to the menu, view all customer information, and exit the system.

3. **Customer Functions:**
   - Customers can log in, add dishes to their table from the menu, view and pay their bill, and exit.

## File Structure
- `Main.java`: Main entry point and control logic of the application.
- `Admin.java`: Admin-specific functionalities and data handling.
- `Customer.java`: Customer-specific data and operations.
- `Menu.java`: Menu management including adding new dishes and displaying the menu.
- `Dish.java`: Class representing individual dishes with name and price.
- `Bill.java`: Handles customer billing, including itemized orders and total price.
- `cusDataFile.txt`: Text file storing customer registration data.]

#### Notes
- Ensure `cusDataFile.txt` is accessible and contains valid customer data.
- Java Runtime Environment (JRE) is required to execute the application.

## Author
- Created by [Asayel Alhuthali]

---
