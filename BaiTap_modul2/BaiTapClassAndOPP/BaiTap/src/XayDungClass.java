import java.util.Scanner;

public class XayDungClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticequation = new QuadraticEquation(a, b, c);
        double denTa = quadraticequation.getDiscriminant();
        if(denTa >= 0){
            System.out.println("Phuong trinh co 2 nghiem " + quadraticequation.getRoot1()+" and "+quadraticequation.getRoot2());
        } else if (denTa == 0) {
            System.out.println(";Phuong trinh co 1 nghiem duy nhat: "+quadraticequation.getRoot2());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
    class QuadraticEquation {
        double a, b, c;
        public QuadraticEquation (double a, double b, double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        private double getA(){
            return a;
        }
        private double getB(){
            return b;
        }
        private double getC(){
            return c;
        }
        public double getDiscriminant(){
            return b*b - 4*a*c;
        }
        public double getRoot1(){
            return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        }
        public double getRoot2(){
            return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        }
    }

