package model;

import model.Car;

public class Hyundai extends Car{
    private int id;
    private String model;
    private double price;
    private double resalePrice;

    /*
    @param id-carID
    @param model-carModel
    @param price-carPrice
    */
    Hyundai(int id,String model,double price){
        this.id=id;
        this.model=model;
        this.price=price;
    }
    /*method to calculate resale value of car
    @return resale value of car
    */
    public double getResalePrice(double price){
        resalePrice= 0.4*price;
        return resalePrice ;
    }
    //method to print details of car i.e car id , model, price and it's resale
    public void printCarDetails(){
        System.out.println("CarId: "+id+"  CarModel :Hyundai "+model+" CarPrice :"
                +price+" CarResale :" +getResalePrice(price));
    } 
    //method to print model of car
     public void printCarModelName(){
        System.out.print("CarModel : "+model);
    }
}//end of Hyundai Class
