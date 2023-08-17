import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
    int[] arr = {1, 3, 5, 2, 6, 7, 9, 10, 12, 20};
        System.out.print("Nhap Phan tu ban muon xoa: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        timPhanTu(arr);
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == input){
                arr[i] = 0;
                break;
            }
        }
        System.out.println("chuoi cuoi cung trong mang la: ");
        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j]+", ");
        }
    }
    public static void timPhanTu(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan tu xem co trong chuoi khong: ");
        int in = sc.nextInt();
            boolean flag = false;
            for(int a = 0; a < array.length; a++){
                if(in == array[a]){
                    System.out.println(+in+" co trong mang, co vi tri la: "+a );
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(+in+" khong co trong mang" );
            }

    }
}
