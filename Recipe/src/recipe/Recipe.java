/******************************************************************************
 *
 *    Programmer: Gary Clifford
 *    Date:       10/12/2019
 *
 *    Purpose: Print out a recipe for Baked Haddock found on the web at
 *                  Allrecipes.com
 *
 *    Info: This copy starts with a Timing need to complete the disk, a 
 *             brief comment about the disk, Ingredients, directions and 
 *             copyright and print information
 *
 *
 *    Modification History 
 *    =====================
 *
 *    Programmer     Date          Modification 
 *    --------------    ------------   ----------------------------------------------
 *     Gary Clifford  10/12/2019   Initial Code
 *
******************************************************************************/



package recipe;


public class Recipe {


    public static void main(String[] args) {

 //Title
        System.out.println("\n\nBaked Haddock\n\n");  //what we are gooding
        
// PrepTime

         System.out.println("Prep    Cook   Ready In");   // prep, cook and server time
         System.out.println("10 m    15 m     25 m");
         System.out.println("");
         
// Comments         
         System.out.println("Recipe By:linda\n\n");    
         System.out.println("\"Haddock (or other white fish) is lightly breaded and baked.");
         System.out.println(" Parmesan adds a nice flavor. Quick and easy to prepare,");
         System.out.println(" it's a nice alternative to deep frying.\"");
         
         System.out.println("");
         System.out.println("");
         
 // Ingredients  
         
         System.out.println("Ingredients");
         System.out.println("");
         System.out.println("3/4 cup milk\t\t\t           1/4 teaspoon ground dried thyme");
         System.out.println("2 teaspoons salt\t\t\t   4 haddock fillets");
         System.out.println("3/4 cup bread crumbs\t\t\t   1/4 cup butter, melted");
         System.out.println("1/4 cup grated Parmesan cheese");
         
         System.out.println("");
         System.out.println("");
         
 // Directions        
         
         System.out.println("Directions");
         System.out.println("");
         System.out.println("1. Preheat oven to 500 degrees F (260 degrees C).");
         System.out.println("2. In a small bowl, combine the milk and salt. In a separate bowl, mix together the bread crumbs, Parmesan"); 
         System.out.println("   cheese, and thyme. Dip the haddock fillets in the milk, then press into the crumb mixture to coat. Place"); 
         System.out.println("   haddock fillets in a glass baking dish, and drizzle with melted butter.");
         System.out.println("3  Bake on the top rack of the preheated oven until the fish flakes easily, about 15 minutes.");   
         System.out.println("");

         // Copyright 
         
         char copyright = (char) 169;        // this is the copyright system in ASCII
            
         System.out.println("ALL RIGHTS RESERVED " + copyright + " 2019 Allrecipes.com");
         System.out.println("Printed from Allrecipes.com 10/12/2019");       

    }
    
}
