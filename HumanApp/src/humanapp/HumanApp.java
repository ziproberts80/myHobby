
package humanapp;



public class HumanApp {

  
    public static void main(String[] args) {
       Human gary = new Human();
       gary.setName("Gary");
       gary.setAge(40);
       gary.setCollegeAttended("MBCC");
       gary.setActivity("walking");
        
        System.out.print(gary);
        
        Human mary = new Human("Mary Madonna",24,"Merrimack College", "Sleeping");
        Human harry = new Human("Harry Smith",101,"Boston College", "Talking");
        

        System.out.println(mary);
        System.out.println(harry);
        
       
       
    }
    
}
