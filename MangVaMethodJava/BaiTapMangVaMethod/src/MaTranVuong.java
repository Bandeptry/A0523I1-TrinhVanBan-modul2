import java.util.Scanner;

public class MaTranVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int [][] arrayVuong = new int[a][a];

        System.out.println("Nhap phan tu vao mang: ");
        for(int i = 0; i < arrayVuong.length; i++){
            for (int j = 0; j < arrayVuong[i].length; j++){
                arrayVuong[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int x = 0; x < arrayVuong.length; x++) {
            for (int y = 0; y < arrayVuong[x].length; y++) {
                if(x == y){
                    sum += arrayVuong[x][y];
                }
            }
        }
        System.out.println("Tong cac duong cheo chinh la: "+sum);

    }
}
