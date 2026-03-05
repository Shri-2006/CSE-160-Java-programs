//Shriyans Singh 114807762
public class Fan {

	public static final int SLOW = 1, MEDIUM = 2, FAST = 3;//initializing the defaults here.
    private int speed;//I kept putting static in here which messed everything up lol
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {//set requires a void, get requires () after
        this.speed = speed;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
        	String res = ("Fan is on, Speed: " + speed + ", Color: " + color + ", Radius: " + radius);
            return res;
        } else {
        	String res=("Fan is off, Speed is 0, Color: " + color + ", Radius: " + radius);
            return res;
        }
    }

    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setSpeed(FAST);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);
        Fan f2 = new Fan();
        f2.setSpeed(MEDIUM);
        f2.setRadius(5);
        f2.setColor("blue");
        f2.setOn(false);

        System.out.println(f1);
        System.out.println(f2);//DONEEEEEEE
    }
}
