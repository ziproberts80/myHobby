
package testexceptions;


public class TestExceptions {

 
    public static void main(String[] args) {

        try{
            
         for (int i = 0; i<10000; i++){
             
             if (i == 850){
                 throw new MyException(i);
             }
         }
            
        }
        catch(MyException e){
            System.out.println(e);
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            
        }
        finally{
            System.out.println("Have a good evening");            
        }
    }
    
}
