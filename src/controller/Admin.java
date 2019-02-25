package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import util.CarUtility;
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
        //method call to add new customers
        case 1: 
                carUtility.addCustomer();
                break;  
        //method call to add car to an existing user
        case 2:
                carUtility.addCar();
                break;
        //method call to print details of customers
        case 3:
                carUtility.printCustomerDetails();
                break;
        //method call to list customers based on Id
        case 4:
                carUtility.listingOnID();
                break;
        //method call to sort customers based on names with cars purchased
        case 5: 
                carUtility.listingOnName();
                break;    
        //method call to generate prizes randomly
        case 6:
                carUtility.generatePrize();
                break;
        //EXIT        
        case 7:
                value = false;
                break;
        default:
                System.out.println("Kindly enter valid choice :");
        }}while(value); //end of do while loop
    }//end of main class
}//end of class Admin
