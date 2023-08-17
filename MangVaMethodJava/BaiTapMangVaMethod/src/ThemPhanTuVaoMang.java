import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 7, 20, 18, 16, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu can them vao: ");
        int add = scanner.nextInt();
        System.out.println("Nhap vi tri can them phan tu vao mang: ");
//        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        /**int[] newArray = */addPhanTu(array, add, index);
        for (int i = 0; i < array.length ;i++ ) {
            System.out.print(array[i]+ ",");
        }

    }

    public static void addPhanTu(int[] arr, int value, int viTri) {
        int[] newArray = new int[arr.length + 1];//độ dài + 1
        int j = 0;
        if(viTri >= 0 && viTri <= (arr.length - 1)){
            for (int i = 0; i < newArray.length; i++) {
                if (i == viTri) {
                    newArray[i] = value;
                }else {
                    newArray[i] = arr[j];
                    j++;
                }
            }
        }else {
            System.out.println("khong chen duoc vao mang");
        }


        //cap nhật mảng cũ
        for (int i = 0; i < arr.length; i++){
            arr[i] = newArray[i];
        }
        //return newArray;
    }
}
