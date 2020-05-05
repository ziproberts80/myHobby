
package javaapplication106;

import java.util.Scanner;
import java.util.Random;

public class JavaApplication106 {


    public static void main(String[] args) {
        
        String usersPick;
        String coinFace;
        int randomNumber;
        
        Scanner in = new Scanner(System.in);          
        Random ran= new Random();
        
        randomNumber = ran.nextInt(2);
        
        System.out.println("random Number is " + randomNumber);
        
        if (randomNumber == 0){
              coinFace  = "Heads";                  
        }
        else {
            coinFace  = "Tails";           
        }
        
        System.out.println("We are playing coin toss");
        System.out.print("You pick: Heads or Tails : ");
        usersPick = in.nextLine();
        
        System.out.println("user picked " + usersPick);
        System.out.println("Coin Face " + coinFace);
        System.out.println("");
        if (usersPick.equalsIgnoreCase(usersPick) ){
            System.out.println("Yes, You won!");
        }
        else{
            System.out.printf("The coin face was %s and you picked %s\n sorry you lost\n", coinFace, usersPick);
        }
        
        
        
        
    
    }
    
}
