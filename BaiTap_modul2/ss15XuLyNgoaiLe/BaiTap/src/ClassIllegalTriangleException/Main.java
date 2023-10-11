package ClassIllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhap vao 3 canh tam giac lan luot la a, b, c");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            try {
                ClassIllegalTriangleException.kiemTraTamGiac(a, b, c);
            } catch (IllegalTriangleException e) {
                throw new RuntimeException(e.getMessage());
            }
        }catch (Exception e){
            System.out.println("sai dinh dang"+ e);
        }
    }
}

