package util;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import model.Customer;

public final class RandomPrizeGenerator {
        static Scanner sc = new Scanner(System.in);
        //method to generate prizes randomly
        public static void generatePrize(ArrayList<Customer> customer){
            //to check if we've atleast 6 customers to generate prize
            if(customer.size()<6){
                System.out.println("There are insuffiecient customers."
                               +"Please add more !");
            }else{
                System.out.println("Please enter 3 valid customer id: ");
                /*storing valid id's in an arraylist for comparison with randomly 
                  generated id's for prizes*/
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
                    //removing element from user entered arraylist after match 
                    idCheck.remove(new Integer(randomCustomerId));
                }
                else{
                    System.out.println("OOPS! Better Luck next time...");
                }
            }
        }
    }
}
