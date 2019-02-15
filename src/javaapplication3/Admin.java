package javaapplication3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.Y;

public class Admin {
    
    public static void main(String[] args){
        //Scanner class to take inputs
        Scanner sc = new Scanner(System.in);
        CarUtility carUtility = new CarUtility();
        boolean value = true;
        
        do{
        System.out.print("\nPreferences : \n"
                + "1. Add Customer \n"
                + "2. Add new car to an existing customer \n"                 
                + "3. Print Customer details \n" 
                + "4. Listing according to sorted ID's\n"
                + "5. Listing according to sorted name \n"
                + "6. Lucky Prize Winning game \n"+"7. EXIT\n");
        System.out.print("\nEnter your preference : ");
        final int number=Integer.parseInt(sc.nextLine());
        System.out.println(" ");
        //menu to call methods according to user preferences
        switch(number){  
        case 1: //method call to add new customers
                carUtility.addCustomer();
                break;  
        case 2://method call to add car to an existing user
                carUtility.addCar();
                break;
        case 3://method call to print details of customers
                carUtility.printCustomerDetails();
                break;
        case 4://method call to list customers based on Id
                carUtility.listingOnID();
                break;
        case 5://method call to sort customers based on names with cars purchased 
                carUtility.listingOnName();
                break;    
        case 6://method call to generate prizes randomly
                carUtility.generatePrize();
                break;
        case 7://EXIT 
                value = false;
                break;
        default:
                System.out.println("Kindly enter valid choice :");
        }}while(value); //end of do while loop
    }//end of main class
}//end of class Admin
