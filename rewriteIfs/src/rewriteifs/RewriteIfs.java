// always write headers
package rewriteifs;

public class RewriteIfs {

    public static void main(String[] args) {
     
        int x = 15;
        String college = "MBCC";
        String response;
        
        response = college == "MBCC" ? "Welcome to MassBay" : "What college do you go to?" ;        
        System.out.println(response);
       
        response = college == "mBCc" ?  "Welcome to MassBay" : "What college do you go to?" ;
        System.out.println(response);
        
        response = college.equalsIgnoreCase("mBCc")?  "Welcome to MassBay" : "What college do you go to?" ;
        System.out.println(response);
    }
    
}
