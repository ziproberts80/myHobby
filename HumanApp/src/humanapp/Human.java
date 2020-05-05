package humanapp;

import java.util.Set;


public class Human {
    
  
    private String name;
    private int age;
    private String collegeAttended;
    private String activity;

    public Human(String name, int age, String collegeAttended, String activity) {
        this.name = name;
        this.age = setAge(age);
        this.collegeAttended = collegeAttended;
        this.activity = activity;
        
    }
    
    public Human() {
        
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        
        if (age< 0 || age>100){
             this.age = -1;
        }else{
             this.age = age;
        } 
        
        return this.age;
    }

    public String getCollegeAttended() {
        return collegeAttended;
    }

    public void setCollegeAttended(String collegeAttended) {
        this.collegeAttended = collegeAttended;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + ", collegeAttended=" + collegeAttended + ", activity=" + activity + "}\n";
    }
    
    
    
}
