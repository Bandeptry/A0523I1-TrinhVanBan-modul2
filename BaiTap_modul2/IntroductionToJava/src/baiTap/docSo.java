package baiTap;

import java.util.Scanner;

public class docSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc:");
        int number = scanner.nextInt();
        String result = " ";

        float donVi = number % 10;
        float chuc = (number % 100) / 10;
        float tram = number / 100;
        if(number > 0){
            if(donVi < 10){
                switch (number){
                    case 1:
                        result = "Mot";
                        break;
                    case 2:
                        result = "Hai";
                        break;
                    case 3:
                        result = "Ba";
                        break;
                    case 4:
                        result = "Bon";
                        break;
                    case 5:
                        result = "Nam";
                        break;
                    case 6:
                        result = "Sau";
                        break;
                    case 7:
                        result = "Bay";
                        break;
                    case 8:
                        result = "Tam";
                        break;
                    case 9:
                        result = "Chin";
                        break;
                }
            }else if(number >= 10 && number < 20){
                String Chuc = "";
                switch (number){
                    case 0:
                        Chuc = "Muoi";
                        break;
                    case 1:
                        Chuc = "mot";
                        break;
                    case 2:
                        Chuc = "Hai";
                        break;
                    case 3:
                        Chuc = "Ba";
                        break;
                    case 4:
                        Chuc = "Bon";
                        break;
                    case 5:
                        Chuc = "Nam";
                        break;
                    case 6:
                        Chuc = "Sau";
                        break;
                    case 7:
                        Chuc = "Bay";
                        break;
                    case 8:
                        Chuc = "Tam";
                        break;
                    case 9:
                        Chuc = "Chin";
                        break;
                }
            }
            System.out.println(result);
        }
    }
}


