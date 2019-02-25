package comparator;

import java.util.Comparator;
import model.Customer;

public final class CustomerIdComparator implements Comparator<Customer> {
    /*method to compare objects of Customer based on id
    @param c1-object1 of customer 
    @param c2-object2 of customer 
    @return ID's in sorted order
    */
    @Override
    public int compare(Customer c1, Customer c2) {
           if(c1.getId() > c2.getId()){
            return 1;
        }  else {
            return -1;
        }
    }
}//end of CustomerIdComparator Class
   