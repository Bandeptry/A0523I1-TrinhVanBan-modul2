package BaiTap;


import java.util.Arrays;
import java.util.Scanner;

public class TimKiemNhiPhanDeQuy {
    public static int[] timKiem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        return arr;

    }

    //ham tim kiem nhi phan
    public static int binarySearch(int[] array, int low, int hight, int value){
        if(low <= hight){
            int mid = (low + (hight - low) / 2);
            if(array[mid] == value)
                return mid;
            else if (array[mid] > value)
                return binarySearch(array, low, mid - 1, value);
            else
                return binarySearch(array, low, mid + 1, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = timKiem();

        System.out.println("nhap phan tu muon tim kiem: ");
        int a = scanner.nextInt();

        int submit = binarySearch(arr, 0, arr.length - 1, a);
        if(submit == -1){
            System.out.println("Khong co");
        }else {
            System.out.println("Phan tu co trong mang: "+submit);
        }
    }
}

