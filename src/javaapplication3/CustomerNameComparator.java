package javaapplication3;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer>{
       //method to compare objects of arraylist based on name 
       public int compare(Customer o1, Customer o2) {
          return o1.getcName().compareTo(o2.getcName());
        }  
}//end of CustomerNameComparator Class
