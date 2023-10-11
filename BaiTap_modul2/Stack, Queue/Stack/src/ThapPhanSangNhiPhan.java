import java.util.Scanner;
import java.util.Stack;

public class ThapPhanSangNhiPhan {
    public int stackNhiPhan(){
        Stack<Integer> stack = new Stack<Integer>();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), soDu;
        while (x > 0){
            soDu = x % 2;
            stack.push(soDu);
            System.out.println(soDu);
            x = x / 2;
        }
        System.out.println("So nhi phan la");
        int n = stack.size();
        for (int i = 0; i < n; i++){
            System.out.println(stack.pop());
        }

        return x;
    }
}
