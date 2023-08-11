import java.util.Scanner;

public class hienThiHinh {
    public static void main(String[] args) {
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("chon:");
        int n = scanner.nextInt();
        switch (n){
            case 1:
                for(int i = 1; i <= 3; i++){
                    for(int j = 1; j <= 5; j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int i = 1; i <= 5; i++){
                    for(int j = 1; j <= i; j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();

                for(int i = 5; i >= 0; i--){
                    for(int j = 0; j < i;j++ ){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();

                for( int i = 0 ; i < 5; i++){
                    for(int j = 0; j < 5 ; j++){
                        if(j >= i ){
                            System.out.print("* ");
                        }else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println();

                for( int i = 0; i < 5; i++){
                    for(int j = 5; j > 0; j--){
                        if((i + 1) >= j){
                            System.out.print("* ");
                        }else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            case 3:
                for( int i = 0; i < 5; i++){
                    for(int j = 5; j > 0; j--){
                        if((i + 1) >= j){
                            System.out.print("* ");
                        }else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
        }
    }
}
