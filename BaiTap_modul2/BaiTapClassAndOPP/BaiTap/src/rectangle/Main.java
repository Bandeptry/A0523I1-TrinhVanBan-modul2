package rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("height: ");
        double height = scanner.nextDouble();
        System.out.print("width: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("C = "+ rectangle.getArea());
        System.out.println("S = "+ rectangle.getPerimeter());
        System.out.println("Hien Thi: "+ rectangle.display());

    }
}


