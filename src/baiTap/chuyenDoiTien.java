package baiTap;

import java.util.Scanner;

public class chuyenDoiTien {
    public static void main(String[] args) {
        System.out.println("Nhap so tien USD can doi:");
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();

        int vnd = 23000;
        double doiTien = usd * 23000;
        System.out.println("So tien da chuyen doi: "+doiTien);
    }
}
