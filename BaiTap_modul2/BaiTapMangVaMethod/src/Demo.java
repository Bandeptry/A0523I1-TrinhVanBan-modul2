import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 7, 20, 18, 16, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần thêm vào: ");
        int add = scanner.nextInt();
        System.out.println("Nhập vị trí cần thêm phần tử vào mảng: ");
        int index = scanner.nextInt();

        addPhanTu(array, add, index);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public static void addPhanTu(int[] arr, int value, int viTri) {
        int[] newArray = new int[arr.length + 1]; // Tạo mảng mới có độ dài lớn hơn một đơn vị
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == viTri) {
                newArray[i] = value; // Chèn giá trị mới vào vị trí chỉ định
            } else {
                newArray[i] = arr[j]; // Sao chép các phần tử từ mảng cũ sang mảng mới
                j++;
            }
        }
        // Sao chép các phần tử từ mảng mới vào mảng cũ
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArray[i];
        }
    }
}
