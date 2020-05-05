// important to put a header here
// don't forget

package cointoss;

import java.util.Scanner;
import java.util.Random;


public class CoinToss {

    public static void main(String[] args) {
        
        int userResponse;
        int randomNumber;
        
        final int HEADS = 0;
        final int TAILS = 1;
        
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        
        System.out.println("Welcome to Coin Toss!");
        System.out.print("Enter 0 for Heads or 1 for Tails: ");
        userResponse = in.nextInt();
        
        randomNumber = ran.nextInt(2);
         
        System.out.println(randomNumber);
        
        
        if ( ((randomNumber == HEADS)  && (userResponse == HEADS ))||((randomNumber == TAILS)  && (userResponse == TAILS))){
            System.out.println("Congratulations, you Won");
        }
        else{
            System.out.println("Sorry, better luck next time");
        }
        

        
       System.out.println("You picked " + determineCoinFace(userResponse) + 
               " and the coin toss was " +  determineCoinFace(randomNumber));

        
    }//main
    
    
    public static String determineCoinFace (int value){
 
        if (value == 0){
            return "Heads";
        }
        else{
          return "Tails";          
        }  
        
    }//determineCoinFace 
    
}//end of class
