// always put a header and comments throughout code
// for better understanding

package simpleconditionals;

import java.util.Scanner;

public class SimpleConditionals {

    public static void main(String[] args) {

// varables:        
        
        int x = 15;
       String college = "MBCC";
       
// start of code:

       if (college == "MBCC"){
           System.out.println("Welcome to MassBay");           
       }
       else
       {
           System.out.println("What college do you go to?");
       }
       
       if (college == "MbcC"){
           System.out.println("Welcome to MassBay");           
       }
       else
       {
           System.out.println("What college do you go to?");
       }
       
          if (college.equalsIgnoreCase("MbcC")){
           System.out.println("Welcome to MassBay");           
       }
       else
       {
           System.out.println("What college do you go to?");
       }
       
       if (x > 0) {
          System.out.println("x is positive");  //page 69
       }

       if (x % 2 == 0) {
          System.out.println("x is even");
       } else {
          System.out.println("x is odd");
       }
       
       if (x > 0) {
           System.out.println("x is positive");
           System.out.println("x is not zero");
       }
       
       if (x > 0) {
          System.out.println("x is positive");
       } else if (x < 0) {
          System.out.println("x is negative");
       } 
       else 
       {
          System.out.println("x is zero");
       }
    }   
       
       
}
