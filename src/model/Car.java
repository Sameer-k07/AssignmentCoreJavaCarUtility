package model;

public abstract class Car{
  private int carID;  
  private String carModel;  
  private int carPrice;
  
   Car(){}
   /*
   @param id-carId
   @param model-carModel
   @param price-carPrice
   */
   Car(int id,String model,int price){  
   this.carID=id;  
   this.carModel=model;  
   this.carPrice=price; 
}
   //method defined to print details of car
   public abstract void printCarDetails();
   //method defined to print model name of car
   public abstract void printCarModelName();
}//end of Car Class

   
   

