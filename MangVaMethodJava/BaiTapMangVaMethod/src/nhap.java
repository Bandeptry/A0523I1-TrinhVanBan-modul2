import java.util.Scanner;

public class nhap {
    public static void main(String[] args) {
        System.out.println("Nhập số hàng bạn muốn tạo");
        Scanner scanner = new Scanner(System.in);
        int sizeX = scanner.nextInt();
        System.out.println("Nhập số cột bạn muốn tạo");
        int sizeY = scanner.nextInt();
        int[][] maTran = new int[sizeX][sizeY];

        System.out.println("Nhập vào các phần tử trong mảng 2 chiều");
        for (int row = 0; row < maTran.length; row++) {
            for (int colum = 0; colum < maTran[row].length; colum++) {
                maTran[row][colum] = scanner.nextInt();
            }
        }

        int maxValue = maTran[0][0]; // Gán giá trị đầu tiên của mảng là maxValue

        // Tìm giá trị lớn nhất trong mảng
        for (int row = 0; row < maTran.length; row++) {
            for (int colum = 0; colum < maTran[row].length; colum++) {
                if (maTran[row][colum] > maxValue) {
                    maxValue = maTran[row][colum];

                }
            }
        }

        System.out.println("Giá trị lớn nhất trong mảng: " + maxValue);
    }
    }


