package util;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.Customer;

public final class  Validator {
        //method to validate customer name
         public static boolean validateCustomerName(String cName) {
            String regx = "^[a-zA-Z\\s]+$";
            Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(cName);
            return matcher.find();
        }
        //method to validate customer id
        public static boolean validateCustomerId(String cId) {
            String regex = "[+-]?[0-9][0-9]*";
            Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(cId);
            return matcher.find();
        }
        //method to check if the entered id is unique or not
        public static boolean isUniqueId(ArrayList<Customer> customer,String id){
            for(Customer c:customer){
                if(c.getId()==Integer.parseInt(id)){
                    return false;
                }
            }
            return true;
        }
}
