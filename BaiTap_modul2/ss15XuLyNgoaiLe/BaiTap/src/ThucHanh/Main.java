package ThucHanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = RanDom.ranDom();
        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        boolean flag = true;
        while (flag){
            int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
            flag = false;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
        }
    }
}
