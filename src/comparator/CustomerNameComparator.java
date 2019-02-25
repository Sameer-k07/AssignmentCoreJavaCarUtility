package comparator;

import java.util.Comparator;
import model.Customer;

public final class CustomerNameComparator implements Comparator<Customer>{
       /*method to compare objects of Customer based on names
       @param c1-object1 of customer 
       @param c2-object2 of customer 
       @return names in sorted order
       */ 
       public int compare(Customer c1, Customer c2) {
          return c1.getcName().compareTo(c2.getcName());
        }  
}//end of CustomerNameComparator Class
