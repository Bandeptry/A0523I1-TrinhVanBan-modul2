package Demo;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] array, int value){
        int index = - 1;
        for (int i = 0; i < array.length; i++){
            if(value == array[i]){
                System.out.print("phan tu ban tim thay o vi tri: ");
                return i;
            }
        }
    return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinearSearch linear = new LinearSearch();
        System.out.println("Nhap do dai phan tu");
        int[] arr = new int[scanner.nextInt()];
        System.out.println("Moi ban nhap gia tri vao mang:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("nhap phan tu ban muon tim");
        int search= scanner.nextInt();
        System.out.println(linear.linearSearch(arr, search));
    }
}

