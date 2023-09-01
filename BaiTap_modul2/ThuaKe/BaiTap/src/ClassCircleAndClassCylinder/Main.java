package ClassCircleAndClassCylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle();
        System.out.println("Nhap ban kinh: ");
        circle.setRadius(scanner.nextDouble());
        System.out.println("Dien tich cua hinh tron la: "+ circle.getArea());
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(2.5, circle.getRadius(), "Green");
        System.out.println("The tich hinh tru: "+ cylinder.theTich());
        System.out.println(cylinder.toString());
    }
}
