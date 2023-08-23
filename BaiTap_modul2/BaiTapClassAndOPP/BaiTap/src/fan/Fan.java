package fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = 1;
    private boolean aBoolean = false;
    private String color = "blue";
    private double  radius = 5;

    public Fan() {
    }

    public Fan(int speed, boolean aBoolean, String color, double  radius) {
        this.speed = speed;
        this.aBoolean = aBoolean;
        this.color = color;
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", aBoolean=" + aBoolean +
                ", color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
