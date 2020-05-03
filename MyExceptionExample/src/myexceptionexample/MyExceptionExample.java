
package myabstractexample;

public class MyExceptionExample {


    public static void main(String[] args) {
     
        int flag = 1000;
        

        
        try {
          String[] students = {"Mike", "Kevin", "Alice", "Fern"};
        
          for (int i = 0; i < flag; i++){
            System.out.println(students[i]);
          }
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Ran into a problem with the array "); // user sees this
            System.out.println(ae);  // this is written to a log file
        }
        catch (Exception e){
            System.out.println("Ran into a problem "); // user sees this
            System.out.println(e);  // this is written to a log file
        }
    }
    
}
