
package testclose;

import java.util.Scanner;

public class TestClose {


     public static void main(String args[]) {
      Scanner keyboard = new Scanner(System.in);
      double amount;

      System.out.print("What's the price of a flash drive? ");
      amount = keyboard.nextDouble();
      amount = amount + 25.00;

      System.out.print("We will bill $");
      System.out.print(amount);
      System.out.println(" to your credit card.");

      
      System.out.println("\n\n\n\n\n =====>Press any key to close windows");
      keyboard.nextLine();
      keyboard.nextLine();
      
      
      
   }
    
}
