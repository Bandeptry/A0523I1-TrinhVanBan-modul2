public class soNT {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to < 100 la:");
        int count = 0, n = 0;
        while (count < 100){
            boolean flag = true;
            if(n > 2){
                for(int i = 2; i <= n; i++){
                    if(n % 2 == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.print(n+ ", ");
                    count++;
                }
            }
            n++;
        }

    }
}
