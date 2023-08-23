import java.util.Scanner;

public class GTNN {
    public static void main(String[] args) {
        System.out.print("Ta co mang: ");
        Scanner scanner = new Scanner(System.in);
        int[] size = new int[5];
        for (int i = 0; i < size.length; i++){
            size[i] = scanner.nextInt();
        }

        int MIN = size[0];
        for(int j = 1; j < size.length; j++){
            if(MIN > size[j]){
                MIN = size[j];
            }
        }
        System.out.println("Gia tri nho nhat la: "+MIN);
    }
}
