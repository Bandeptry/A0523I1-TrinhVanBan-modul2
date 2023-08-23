package stop_watch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopwatch = new StopWatch();
        System.out.println(stopwatch.getStartTime());
        System.out.println("Moi ban nhap so thu tu de biet thong tin: ");
        System.out.println("1.  startTime");
        System.out.println("2.  endTime");
        System.out.println("3.  trả về thời gian đã trôi qua theo số milisecond giây");
        System.out.println("4. exit");
        int input ;
//        do {
//            if(input == 1){
//                System.out.println(stopwatch.start());
//            }else if (input == 3)
//        }while (input < 5);
        do{
            input = +scanner.nextInt();
            long a, b;
            switch (input) {
                case 1:
                    a = stopwatch.start();
                    System.out.println(a);
                    break;
                case 2:
                    b = stopwatch.stop();
                    System.out.println(b);
                    break;
                case 3:
                    System.out.println(stopwatch.getElapsedTime());
                    break;
                case 4:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("Nhap khong hop le theo yeu cau");
            }
        }while (input < 5);
    }
}
