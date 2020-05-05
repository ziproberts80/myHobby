// always have a header

package ballapp;

public class Ball {
    
    private String ballType;
    private String ballColor;
    private String ballMaterial;
    public String ballState;

    public Ball() {   // empty constructor
       this("Basket", "Orange", "Rubber", "on Ground");
               
    }


    public Ball(String ballType, String ballColor, String ballMaterial, String ballState) {
        this.ballType = ballType;
        this.ballColor = ballColor;
        this.ballMaterial = ballMaterial;
        this.ballState = ballState;
    }  

    @Override
    public String toString() {
        return "Ball{" + "ballType=" + ballType + ", ballColor=" + ballColor + ", ballMaterial=" + ballMaterial + ", ballState=" + ballState + '}';
     
    }

    public String getBallType() {
        return ballType;
    }

    public void setBallType(String ballType) {
        this.ballType = ballType;
    }

    public String getBallColor() {
        return ballColor;
    }

    public void setBallColor(String ballColor) {
        this.ballColor = ballColor;
    }

    public String getBallMaterial() {
        return ballMaterial;
    }

    public void setBallMaterial(String ballMaterial) {
        this.ballMaterial = ballMaterial;
    }

    public String getBallState() {
        return ballState;
    }

    public void setBallState(String ballState) {
        this.ballState = ballState;
    }
    
    
    
    
    
}
