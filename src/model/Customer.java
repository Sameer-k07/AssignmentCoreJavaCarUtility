package model;

import model.Car;
import java.util.ArrayList;
import java.util.Scanner;
import model.Hyundai;
import model.Maruti;
import model.Toyota;
import util.Validator;

public class Customer {
  private int cID;  
  private String cName;  
  ArrayList<Car> carList=new ArrayList<Car>();  
  Scanner sc = new Scanner(System.in);
  /*
  @param cid-id of customer
  @param cname-name of customer
  */
   public Customer(int cid,String cname){  
      this.cID=cid;  
      this.cName=cname;  
   }  
   /*method to get customer name
   @return customer name
   */
   public String getcName(){
      return cName;  
   }
   /*method to get customer id
   @return customer id
   */
   public int getId(){
      return cID;
   }
   //method to add car to an existing customer
   public void addNewCar(){
       
       int choice;
       int id;
       final double price;
       final String model;
       Car car;
       boolean access = true;
       System.out.print("Enter your car choice :\n"
                       +"1. Toyota\n"
                       +"2. Maruti\n"
                       +"3. Hyundai\n");
       do{
       choice = Integer.parseInt(sc.nextLine());
       //to check if the valid choice is entered or not
       if(choice==1 || choice==2 || choice==3 )
       {
           access=false;
       }else{
           System.out.print("Invalid choice entered. Enter valid choice :");
       }
       }while(access);   
       System.out.println("Enter valid id , model and price ");
       id =  Integer.parseInt(sc.nextLine());
       model=sc.nextLine();
       price= Double.parseDouble(sc.nextLine());
       //menu to add models of car to an existing user
       switch(choice){
           case 1 :
               car = new Toyota(id,model,price);
               carList.add(car);
               break;
           case 2 :
               car = new Maruti(id,model,price);
               carList.add(car);
               break;
           case 3 :
               car = new Hyundai(id,model,price);
               carList.add(car);
               break;
           default:
               System.out.print("Cars not available ");
       }
      
   }
  //method to print details of customer i.e name and id 
  public void printDetails(){
   System.out.println("CustomerId: "+cID+"  CustomerName : "+cName);
   for(Car car: carList){
       //method call to print details of car
       car.printCarDetails();
   }//end of foreach loop
} 
  //method to print model of car 
  public void printCarModel(){
       for(Car car :carList){
        //method call to print model of car
           car.printCarModelName();
    } //end of foreach loop 
}
}//end of Customer class
