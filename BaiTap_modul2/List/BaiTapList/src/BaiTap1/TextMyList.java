package BaiTap1;

import java.util.Scanner;

public class TextMyList {
    public static void main(String[] args) {
        MyList<Integer> text = new MyList<>(20);
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Nhap phan tu vao mang it nhat 5 phan tu");
        do{
            flag = false;
            int a = 0;
            if(a <= 5){
                System.out.println("nhap index va element "+a);
                text.add(scanner.nextInt(), scanner.nextInt());
                flag = true;
            }
            a++;
        }while (flag);
        for (int i = 0; i < text.element.length; i++){
            System.out.println(text.element[i]);
        }

    }


}
