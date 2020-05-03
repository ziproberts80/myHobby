
package myabstractexample;

public class MyAbstractExample {

 
    public static void main(String[] args) {
       
        TheApplicationClass ac = new TheApplicationClass();
        
        ac.connectToDB();
        ac.doWork();
        ac.disconnectDB();
                
        
    }
    
}
