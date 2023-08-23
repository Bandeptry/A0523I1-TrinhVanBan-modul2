import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        System.out.println("Nhap do dai mang thu 1: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int [] array1 = new int[x];
        System.out.print("nhap phan tu vao mang 1: ");
        for(int i = 0; i < array1.length ;i++){
            array1[i] = scanner.nextInt();
            System.out.println("array1["+i+"] = "+array1[i]);
        }

        System.out.println("Nhap do dai mang thu 2: ");
        int y = scanner.nextInt();
        int [] array2 = new int[y];
        System.out.print("nhap phan tu vao mang 2: ");
        for(int j = 0; j < array2.length ;j++){
            array2[j] = scanner.nextInt();
            System.out.println("array1["+j+"] = "+array2[j]);
        }

        int[] array3 = new int[array1.length + array2.length];
        int j = 0;
        for(int i = 0; i < array3.length; i++){
            if(i < array1.length){
                array3[i] = array1[i];
            }else {
                array3[i] = array2[j];
                j++;
            }
        }
        for (int count = 0; count < array3.length; count++){
            System.out.print(array3[count] + ", ");
        }
    }
}
