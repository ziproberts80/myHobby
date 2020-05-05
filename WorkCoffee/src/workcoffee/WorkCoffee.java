
package workcoffee;


public class WorkCoffee {

    /*
    
    x == y // x is equal to y
    x != y // x is not equal to y
    x > y // x is greater than y
    x < y // x is less than y
    x >= y // x is greater than or equal to y
    x <= y // x is less than or equal to y
   
    */

    public static void main(String[] args) {

        boolean happy = true;
        boolean smart = true;
        boolean theProfessor = false;
        
        int x = 10;
        int y = 50;
        int z = 0;
        
        boolean evenValue;


       if ((z>= x)  && (z<=y)){
            System.out.printf("The number %d is between %d  and %d inclusive", z, x,y); 
            
         if (z%2 == 0){
             System.out.println(" and " + z + "is even");
         }
         else
         {
              System.out.println(" and " + z + " is odd");
         }
      }
     else
     {
             System.out.println(z + " is not between 10 and 50");
     }
       
      
    if (z > 0) {
         System.out.println("z is positive");
         System.out.println("z is not zero");
    }
    else if (z < 0){
          System.out.println("z is negative");
         System.out.println("z is not zero");
    }
    else{
        System.out.println("z is zero");   
    }
        
        
        if (!(happy)){
            System.out.println("So today you are happy");
        }
        else
        {
             System.out.println("Today you are sad");
            
        }
        
        if (happy && theProfessor ){
            System.out.println("You are both happy and the processor");
        }
        else
        {
            System.out.println("You could be happy or you could be the professor");
            System.out.println("You cannot be both");        
        }
        
     }
    
}
