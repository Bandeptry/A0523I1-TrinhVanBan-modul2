package ThucHanh;
import java.util.Random;

public class RanDom {
    public static Integer[] ranDom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

}
