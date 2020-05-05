
package javaapplication103;

import  java.util.Random;


public class JavaApplication103 {


    public static void main(String[] args) {
    
        Random random = new Random();
        int number = random.nextInt(2);
        System.out.println(number);

       proc1();
       proc2();
       proc3();
       
        System.out.println("You get "+ mpg(1000.0, 17.0) + " miles per gallons");
        
    }//main
    
    public static void proc1(){
          System.out.println("Live");        
    }
            
    public static void proc2(){
        System.out.println("Laugh");
    }

    public static void proc3(){
        System.out.println("Love");
    }

    public static double mpg(double mi, double gas){
         return mi/gas;
    }
    
    
    
    
    
    
    
    
    
              public static void title()
              {
                System.out.println("PlaceHolder: TITLE");
              }
              
              
              public static void comments()
              {
                System.out.println("PlaceHolder: COMMENTS");
              }
              
              
              public static void prepTime()
              {
                System.out.println("PlaceHolder: PREPTIME");
              }
              
              
              public static void ingredients()
              {
                System.out.println("PlaceHolder: INGREDIENTS");
              }
              
              
              public static void directions()
              {
                System.out.println("PlaceHolder: DIRECTIONS");
              }
              
              
              public static void copyrightInfo()
              {
                System.out.println("PlaceHolder: COPYRIGHTINFO");
              }

}
   