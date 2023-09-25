import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        int c = (int) f(a);
        System.out.println(c);
    }
     public static long f(int x){
        if(x != 0)
            System.out.println(x % 10);
        f(x / 10);
         return 0;
     }
}
