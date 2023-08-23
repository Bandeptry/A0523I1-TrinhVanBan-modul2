package fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setaBoolean(true);
        fan1.setColor("yellow");
        fan1.setRadius(10);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setaBoolean(false);
        fan2.setColor("blue");
        fan2.setRadius(5);

        System.out.println("Fan 1 : "+ fan1.toString());
        System.out.println("Fan 2 : "+ fan2.toString());
    }
}
