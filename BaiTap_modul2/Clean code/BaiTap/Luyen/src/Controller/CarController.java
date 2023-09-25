package Controller;

import Sevice.CarService;
import Sevice.ICarService;

import java.util.Scanner;

public class CarController {
    public static void displayMenu() {
        ICarService iCarService = new CarService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1. Display" +
                    "\n 2. Add Car" +
                    "\n 3. Delete Car" +
                    "\n 4. Search" +
                    "\n 5. Exit"

            );
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Chuc nang hien thi");
                    iCarService.display();
                    break;
                case 2:
                    System.out.println("chu nang them moi Car");
                    iCarService.add();
                    break;
                case 3:
                    System.out.println("Chuc nang xoa Car");
                    iCarService.delete();
                    break;
                case 4:
                    System.out.println("chuc naang tim kiem xe");
                    iCarService.search();
                    break;
                default:
                    flag = false;
                    break;

            }
        } while (flag);


    }
}
