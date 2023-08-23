import java.util.Scanner;

public class UngDungDemSVDo {
    public static void main(String[] args) {
        System.out.println("Ung dung dem so luong sinh vien do");
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do{
            System.out.print("Nhap so luong hoc sinh nhap hoc: ");
            size = scanner.nextInt();
            if(size > 30){
                System.out.println("So luong khong vuot qua 30");
            }
        }while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("nhap diem cho hoc sinh "+(i + 1)+" : ");
            array[i] = scanner.nextInt();
            i++;
        }

        int cout = 0;
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
            if(array[j] >= 5 && array[j] <= 10){
                cout++;
            }
        }
        System.out.println("\nSo luong hoc sinh do la: "+ cout);
    }
}
