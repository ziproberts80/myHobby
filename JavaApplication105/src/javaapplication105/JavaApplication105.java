
package javaapplication105;

import java.util.Scanner;


public class JavaApplication105 {


    public static void main(String[] args) {
        
        double celsius  ;
        double fahrenheit ;
         final double  RATIO9to5 = 1.8;
       
       
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter degrees Celsius and I will convert to Farenheit: ");
        
       celsius = in.nextDouble();
     
       fahrenheit= (celsius * RATIO9to5) + 32;
       
       fahrenheit = CtoF(celsius);
       
       System.out.printf("%.1fC = %.1fF\n", celsius, fahrenheit);
       
       
    } //main
    
    
    public static double CtoF (double celsiusDegree){
         
          final double  RATIO9to5 = 1.8;
         return  (celsiusDegree * RATIO9to5) + 32;
    }
    
    
    
    
}//class
