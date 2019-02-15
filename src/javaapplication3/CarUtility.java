package javaapplication3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CarUtility {

        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> customer =new ArrayList<Customer>();
        int flag;
        //method to add new customer
        public void  addCustomer(){
            System.out.print("Customer ID: ");
            final int  cId = Integer.parseInt(sc.nextLine());
            System.out.print("Customer Name: ");
            final String cName = sc.nextLine();
            Customer addCustomerDetails =new Customer(cId,cName);
            //adding customer details to arrayist
            customer.add(addCustomerDetails);
        }
        //method to add car to an existing user
        public void addCar(){
            
            System.out.print("Enter customer id to add cars :");
            final int id = Integer.parseInt(sc.nextLine());
            for(Customer custing : customer){
                flag=0;
                //to check if we have existing valid userID
                if(custing.getId()==id){
                   System.out.println("Customer found!");
                   custing.addNewCar();
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
            for(Customer e:customer){
                 System.out.println("Customer Id: "+e.getId()+" Customer Name  "
                 +e.getcName());
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
            for(Customer e:customer){
                System.out.println("Customer Name: "+e.getcName());
                e.printCarModel();
                System.out.println(" ");
            }
        }
        }
        //method to generate prizes randomly
        public void generatePrize(){
            //to check if we've atleast 6 customers to generate prize
            if(customer.size()<6){
            System.out.println("There are insuffiecient customers."
                               +"Please add more !");
            }else{
            System.out.println("Please enter 3 valid customer id: ");
            ArrayList<Integer> idCheck = new ArrayList<Integer>();
            //to generate random number
            Random rand = new Random();
            //user input for id's to check if they've won prizes
            for(int i=0;i<3;i++){
                //add user input to arraylist
                idCheck.add(sc.nextInt());
            }
            for(int i=0;i<6;i++){
            //creating random index
            int randomNumber = rand.nextInt(customer.size());
            //using random index to fetch random valid id
            int randomCustomerId = customer.get(randomNumber).getId();
            //to check if the valid user matches with random valid id generated
            if(idCheck.contains(randomCustomerId) && idCheck.size()!=0){
                System.out.print("Customer with id :"+randomCustomerId+" has "
                + "won\n");
                idCheck.remove(new Integer(randomCustomerId));
            }
            else{
                System.out.println("OOPS! Better Luck next time...");
            }
            }
        }
        }
       
}//end of CarUtility Class
