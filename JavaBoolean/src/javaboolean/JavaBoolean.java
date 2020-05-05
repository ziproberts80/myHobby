/* always place a header */


package javaboolean;

public class JavaBoolean {

    public static void main(String[] args) {

        
        boolean true_b = true;
        boolean false_b = false;
        
        if (true_b && true_b){
            System.out.println("Both have to be true");
        }
        else{
            System.out.println("One or the other or all are false");
        }
        
        if (false_b || true_b) {
            System.out.println("Prints the TRUE part of conditional");
            
        }
        else{
            System.out.println("Prints the FALSE part of conditional");
        }
        
        String myOutput = true_b ? "this was true" : "this was false";
        
        System.out.println(myOutput);
        
    }
    
}
