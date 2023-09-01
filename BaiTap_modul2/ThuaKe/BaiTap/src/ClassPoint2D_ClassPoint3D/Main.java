package ClassPoint2D_ClassPoint3D;

public class Main {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setXYZ(1,3,5);
        System.out.println(point3D.toString());

        Point2D point2D = new Point2D();
        point2D.setXY(2,4);
        System.out.println(point2D.toString());
    }

}
