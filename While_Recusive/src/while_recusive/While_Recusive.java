// always put a header

package while_recusive;


public class While_Recusive {


    public static void main(String[] args) {
       
       // flags to indicate number of loops
        int i = 0;
        int j = 0;
        int k = 0;
        int z = 0;
        
        // holds total of adding 0+1+2+3....100  

        int total = 0;  // declare and initialize total
        
// nice while loop to add numbers 0 to 100                
        while (i <=100){
             
          total += k++;       // is shortcut code for next two statements
         //   total = total + k;
         //   k = k + 1;
 
            i++;
        }// end of while
        
        System.out.println("\n\n\nWHILE Loop:    The sum of 0 to 100 is " + total);
        
        total = 0;   //reset total back to 0
        
        
// for Loop

        for(int x=0; x<=100;x++){
            total += x;
        } // end of for
        
        System.out.println("FOR Loop:      The sum of 0 to 100 is " + total);

        total = 0;   //reset total back to 0
        
// Loop syntax 3  do.. while        

        do{
          total += j++;
          z++;
        }while(z <= 100);
        
        System.out.println("DO_WHILE Loop: The sum of 0 to 100 is " + total);
        
        System.out.println("\n\n\n");

// two recursive procedures

        border(3);
        countdown(10);
        border(3);
        
        
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

        public static void border(int n) {
          if (n > 0) {
            System.out.print("\n====================================");
            border(n - 1);
          }
          else
          {
              System.out.println("\n");
          }
        }
    
}
