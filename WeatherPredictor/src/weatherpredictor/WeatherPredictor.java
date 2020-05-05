
package weatherpredictor;

import java.util.Random;

public class WeatherPredictor {


    public static void main(String[] args) {
        Random ran = new Random();
        
        int ranNumber = ran.nextInt(20);
        
        System.out.println("Your Weather Predictor is here");
        System.out.println("to give you some idea of what to expect today in terms of the weather");
        System.out.println("\n\n Ready....\n\n"); 
        System.out.println("Todays weather prediction is:");
        System.out.println(todaysWeather(ranNumber));
       
        

    } //main
    
    public static String todaysWeather(int weatherNumber){
        String answer;
        
        switch(weatherNumber){
            case 0:
               answer = "Rain Today";
                break;
             case 1:
               answer = "Cloudy with chance of Showers";
                break;
             case 2:
               answer = "Sunny";
                break;
             case 3:
               answer = "Partly Sunny";
                break;
             case 4:
               answer = "Heavy Rains";
                break;
             case 5:
               answer = "Flood Warning";
                break;
             case 6:
               answer = "Santa Anna Wild Fires";
                break;
             case 7:
               answer = "Microbursts Be Aware";
                break;
             case 8:
               answer = "Sharknado!!";
                break;
             case 9:
               answer = "Hurricane - Buy batteries and water";
                break;
             case 10:
               answer = "Hot Summer Night";
                break;
             case 11:
               answer = "Cool Fall Morning followed by clouds";
                break;
             case 12:
               answer = "Frost Tonight";
                break;
             case 13:
               answer = "Frostbite weather - Dress warmly";
                break;
             case 14:
               answer = "Windy at times Gale gusts";
                break;
             case 15:
               answer = "Hail watch out !";
                break;
             case 16:
               answer = "Thunder and Lightning";
                break;
             case 17:
               answer = "Winterly Weather";
                break;
             case 18:
               answer = "Clear Night with a Full Moon";
                break;
             case 19:
               answer = "Stay in with Hot Chocolate and read a good book";
                break;
             default:
                 answer = "This should next execute!";
  
        }
        
        return answer;
        
        
        
        
    } // todaysWeather
    
} //class

