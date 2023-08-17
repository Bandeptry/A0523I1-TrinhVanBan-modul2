import java.util.Scanner;

public class Dem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ky tu: ");
        String input = scanner.nextLine();
        char [] kyTu = {'a', 'b', 'c', 'c', 's', 'f', 's', 'x', 'y', 's'};
        int count = 0;
        for (int i = 0; i < kyTu.length; i++){
            if(input.charAt(0) == kyTu[i]){
                count++;
            }
        }
        System.out.println("Ky tu "+input+" xuat hien trong mang "+count+" lan");
    }
}
