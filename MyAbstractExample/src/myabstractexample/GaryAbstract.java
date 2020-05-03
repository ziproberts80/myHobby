
package myabstractexample;


 abstract class GaryAbstract {
    
    public  boolean connectToDB(){
        System.out.println("You are now connected to DB");
        return true;
    }
    
    public  void getDBData(){
        System.out.println("You are now getting the data from DB");
    }
    public  void disconnectDB(){
         System.out.println("You are now getting disconnected from DB");
    }
    
 
        

    
}
