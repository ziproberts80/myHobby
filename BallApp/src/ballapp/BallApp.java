// always have a header

package ballapp;


public class BallApp {

  
    public static void main(String[] args) {
        
        Ball myBasketBall = new Ball();
        Ball myBall = new Ball("Dodge Ball", "Red", "Rubber", "On Ground");
        
        
        System.out.println(myBasketBall);
        
        System.out.println(myBall);
         
         myBall.setBallState("Hitting me in the face");
          System.out.println(myBall);
          
    }
    
}
