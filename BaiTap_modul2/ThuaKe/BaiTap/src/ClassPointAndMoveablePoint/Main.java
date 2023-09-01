package ClassPointAndMoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1,3);
        System.out.println(point.toString());

        MoveablePoint moveablePoint = new MoveablePoint(2,4,5,8);
        System.out.println(moveablePoint.toString());
        //System.out.println(moveablePoint.move());
        float[] newPosition = moveablePoint.move();
        System.out.println("this: x = " + newPosition[0] + ", y = " + newPosition[1]);

    }
}
