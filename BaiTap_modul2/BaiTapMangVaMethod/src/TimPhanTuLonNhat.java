import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        System.out.println("Nhap so hang ban muon tao");
        Scanner scanner = new Scanner(System.in);
        int sizeX = scanner.nextInt();
        System.out.println("Nhap so cot ban muon tao");
        int sizeY = scanner.nextInt();
        int[][] maTran = new int[sizeX][sizeY];


        int colum = 0;
        System.out.println("Enter " + maTran.length + " rows and " +
                maTran[0].length + " columns: ");
        for(int row = 0; row < maTran.length; row++){
            for(colum = 0; colum < maTran[row].length; colum++){
                maTran[row][colum] = scanner.nextInt();
            }
        }
        int MAX =  maTran[0][0];

        for(int row = 0; row < maTran.length; row++){
            for(colum = 0; colum < maTran[row].length; colum++){
                if(maTran[row][colum] >  MAX){
                    MAX = maTran[row][colum];
                }
            }
        }
        System.out.println("gia tri lon nhat la MAX = "+MAX);
    }
}
