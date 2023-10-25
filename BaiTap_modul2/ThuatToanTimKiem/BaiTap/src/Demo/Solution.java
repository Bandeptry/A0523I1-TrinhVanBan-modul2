package Demo;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int value){
        if(matrix.length == 0)
            return false;

        int hang = matrix.length;
        int cot = matrix[0].length;

        int batDau = 0;
        int ketThuc = (hang * cot) - 1;
        while (batDau <= ketThuc){
            int mid = (batDau + (ketThuc - batDau) / 2);
            if(matrix[mid / cot][mid % cot] == value){
                return true;
            }
            if(matrix[mid / cot][mid % cot] < value){
                batDau = mid + 1;
            }else {
                ketThuc = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };
        boolean result = solution.searchMatrix(matrix ,4);
        if (result) {
            System.out.println("Tìm thấy giá trị trong ma trận.");
        } else {
            System.out.println("Không tìm thấy giá trị trong ma trận.");
        }
    }
}


