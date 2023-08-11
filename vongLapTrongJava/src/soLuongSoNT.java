import java.util.Scanner;

public class soLuongSoNT {
    public static void main(String[] args) {
        System.out.println("Nhap so luong so nguyen to");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int N = 0, cout = 0;
        while (n > cout){
            boolean flag = true;
            if(N > 2){
                for(int i = 2; i < N; i++){
                    if(N % i == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.print(N +", ");
                    cout++;
                }
            }
            N++;
        }

    }
}
