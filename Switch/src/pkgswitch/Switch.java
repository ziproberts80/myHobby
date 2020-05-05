/* Always include a header */

package pkgswitch;

import java.util.Scanner;

public class Switch {


    public static void main(String[] args) 
    { 
        int day = 0; 
        String dayType; 
        String dayString; 
  
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter day of week in terms of a number");
        System.out.println("1 for Monday, 2 for Tuesday .... 7 for Sunday");
        System.out.print("Enter day as a number: ");
        day = in.nextInt();
        
        if ((day <= 0)  || day >= 8){
            System.out.println("Just numbers between 1 and 7");
            System.out.println("Stopping program");
            System.exit(1);
        }
        
        
        switch (day) { 
        case 1: 
            dayString = "Monday"; 
            break; 
        case 2: 
            dayString = "Tuesday"; 
            break; 
        case 3: 
            dayString = "Wednesday"; 
            break; 
        case 4: 
            dayString = "Thursday"; 
            break; 
        case 5: 
            dayString = "Friday"; 
            break; 
        case 6: 
            dayString = "Saturday"; 
            break; 
        case 7: 
            dayString = "Sunday"; 
            break; 
        default: 
            dayString = "Invalid day"; 
        } 
  
        switch (day) { 
        // multiple cases without break statements 
  
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
            dayType = "Weekday"; 
            break; 
        case 6: 
        case 7: 
            dayType = "Weekend"; 
            break; 
  
        default: 
            dayType = "Invalid daytype"; 
        } 
  
        System.out.println(dayString + " is a " + dayType); 
    } 
    
}
