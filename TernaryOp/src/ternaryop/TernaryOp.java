/* always put a header here */

package ternaryop;


public class TernaryOp {

    public static void main(String[] args) {
        
        // result = testCondition ? value1 : value2
        
        String clientName = "Tom Turkey";
        String gender = "Male";
        
        int age = 32;

        
        String fullName = gender == "Male"? "Mr " + clientName : "Ms " + clientName;                
        System.out.printf("Hello %s\n", fullName);
        
        String ageOutput = age < 30 ?  "Hello youngster" : "Hey old Dude";
        
        System.out.println(ageOutput);
        
        
        String moreOutput = (age < 30   && gender == "Male")? "Hey, Man!" :"Good Morning, Ms";
        System.out.println(moreOutput);
    
    }
    
}
