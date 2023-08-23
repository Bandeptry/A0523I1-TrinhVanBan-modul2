import java.util.Scanner;

public class TinhTongCacSoOMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang ban muon: ");
        int sizeX = scanner.nextInt();
        System.out.println("Nhap so cot ban muon: ");
        int sizeY = scanner.nextInt();
        double[][] array = new double[sizeX][sizeY];

        System.out.println("nhap cac phan tu ban muon them vao mang :");
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print("array["+ i +"]["+ j+"] = ");
                array[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("ban muon tinh tong cot may ? => ");
        int cot = scanner.nextInt();
        double tong = tinhTongCot(array, cot);
        System.out.println("Cot thu "+cot+" co tong bang "+tong);

    }
    public static double tinhTongCot(double[][] arr, int j){
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i][j];
        }
        return sum;
    }
}
