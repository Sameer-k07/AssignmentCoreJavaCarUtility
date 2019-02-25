package util;

import util.Validator;
import model.Customer;
import comparator.CustomerNameComparator;
import comparator.CustomerIdComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarUtility  {

        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> customer =new ArrayList<Customer>();
        int flag;
        
        //method to add new customer
        public void  addCustomer(){
            System.out.print("Customer ID: ");
            final String cId=sc.nextLine();
            //to check if the entered customer id is valid or not
            if(!Validator.validateCustomerId(cId)){
                System.out.println("Invalid customer ID entered ");
                return;
            }
            //to check if the customer id is unique or not
            if(!Validator.isUniqueId(customer,cId)){
                System.out.println("Please enter unique ID ");
                return;
            }
            System.out.print("Customer Name: ");
            final String cName = sc.nextLine();
            //to check if the entered customer name is valid or not
            if(!Validator.validateCustomerName(cName)){
                System.out.println("Invalid customer name entered ");
                return;
        }
            //adding customer details to arrayist
            Customer addCustomerDetails =new Customer(Integer.parseInt(cId),cName);
            customer.add(addCustomerDetails);
        }  
        //method to add car to an existing user
        public void addCar(){
            System.out.print("Enter customer id to add cars :");
            final int id = Integer.parseInt(sc.nextLine());
            for(Customer customerCheck : customer){
                flag=0;
                //to check if we have existing valid userID
                if(customerCheck.getId()==id){
                   System.out.println("Customer found!");
                   customerCheck.addNewCar();
                   System.out.print("Car added successfully ");
                }
                else{
                  flag=1;  
                }
            }
            if(flag==1){
                System.out.print("Customer not found. Invalid id entered!\n");
            }
        }
         //method to print details of customer
        public void printCustomerDetails(){
            //to check if we've some customers or not
            if(customer.size()==0){
            System.out.println("There are no customers.Please add!");
            }else{
            for(Customer showCustomerDetails : customer){
                showCustomerDetails.printDetails();
            }
        }
        }    
        //method to list customers based on id
        public void listingOnID(){
            //to check if we've some customers or not
            if(customer.size()==0){
            System.out.println("There are no customers.Please add!");
            }else{
            //using sort function with calling of CustomerIdComparator class 
            Collections.sort(customer,new CustomerIdComparator());
            System.out.println("Sorted list entries on the basis of Id: ");
            for(Customer customerList:customer){
                 System.out.println("Customer Id: "+customerList.getId()+" "
                         + "Customer Name  "+customerList.getcName());
            }
        } 
        }
        //method to list customers based on names along with cars purchased
        public void listingOnName(){
            //to check if we've some customers or not
            if(customer.size()==0){
            System.out.println("There are no customers.Please add!");
            }else{
            //using sort function with calling of CustomerNameComparator class 
            Collections.sort(customer,new CustomerNameComparator());
            System.out.println("Sorted list entries on the basis of name: ");
            for(Customer customerList:customer){
                System.out.println("Customer Name: "+customerList.getcName());
                customerList.printCarModel();
                System.out.println(" ");
            }
        }
        }
        //method to generate prizes randomly
        public void generatePrize() {
            RandomPrizeGenerator.generatePrize(customer);
        }
       
}//end of CarUtility Class
