package Controller;

import Service.IProductService;
import Service.ProducService;

import java.util.Scanner;

public class ProductController {
    public static void displayMenu(){
        IProductService iProductService = new ProducService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("chon chuc nang: ");
            System.out.println("1. Display"+
                    "\n 2. Add"+
                    "\n 3. Delete"+
                    "\n 4. Search"+
                    "\n 5. Exit"
            );
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Chuc nang hien thi");
                    iProductService.display();
                    break;
                case 2:
                    System.out.println("Chuc nang them moi san pham");
                    iProductService.add();
                    break;
                case 3:
                    System.out.println("Chuc nang xoa san pham");
                    iProductService.delete();
                    break;
                case 4:
                    System.out.println("Chuc nang tim kiem");
                    iProductService.search();
                    break;
                default:
                    flag = false;
            }
        }while (flag);

    }
}
