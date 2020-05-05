// always put a header here

package javaapplication35;


public class JavaApplication35 {

    public static void main(String[] args) {
       
        int i = 0;
        int j = 0;
        int k = 0;
        int z = 0;
        int total = 0;
                
        while (i <=100){
             
          total += k++;       // is shortcut code for next two statements
         //   total = total + k;
         //   k = k + 1;
 
            i++;
        }// end of while
        
        System.out.println("WHILE Loop:    The sum of 0 to 100 is " + total);
        
        total = 0;   //reset total back to 0
        for(int x=0; x<=100;x++){
            total += x;
        } // end of for
        
        System.out.println("FOR Loop:      The sum of 0 to 100 is " + total);

        total = 0;   //reset total back to 0
        
        do{
          total += j++;
          z++;
        }while(z <= 100);
        
        System.out.println("DO_WHILE Loop: The sum of 0 to 100 is " + total);
        
        System.out.println("\n\n\n");
        
        countdown(10);
        
    }     // end of main 
        
        // recursive procedure
      public static void countdown(int n) {
          if (n == 0) 
          {
             System.out.println("Blastoff!");
          } 
          else 
          {
              System.out.println(n);
              countdown(n - 1);
          }
        }  // countdown

 
    
}
