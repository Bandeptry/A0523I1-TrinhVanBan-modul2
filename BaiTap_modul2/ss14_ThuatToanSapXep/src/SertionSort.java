import java.util.Arrays;
import java.util.Scanner;

public class InSertionSort {
    public static void insertionSort(int[] arr) {
        int x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            while (0 < i && x < arr[i - 1]) {
                arr[i] = arr[i - 1];
                arr[i - 1] = x;
                i--;
            }
            //arr[i] = x;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao do dai cua mang: ");
        int arrSize = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Nhap vao gia tri thu arr[" + i + "] : ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mang truoc khi duoc sort la: "+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Mang sau khi duoc sort la: "+Arrays.toString(arr));
    }
}
