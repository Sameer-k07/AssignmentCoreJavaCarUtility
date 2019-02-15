package javaapplication3;

import java.util.Comparator;

public class CustomerIdComparator implements Comparator<Customer> {
    //method to compare objects of arraylist based on id
    @Override
    public int compare(Customer o1, Customer o2) {
           if(o1.getId() > o2.getId()){
            return 1;
        }  else {
            return -1;
        }
    }
}//end of CustomerIdComparator Class
   