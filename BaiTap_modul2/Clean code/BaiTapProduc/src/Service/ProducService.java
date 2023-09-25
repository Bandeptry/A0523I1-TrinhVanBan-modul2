package Service;

import Model.Product;
import Repository.IProductRepository;
import Repository.ProductRepository;

import java.util.Scanner;

public class ProducService implements IProductService {
    private IProductRepository iProductRepository = new ProductRepository();
    @Override
    public void display() {
        Product[] products = iProductRepository.getListProduct();
        for(int i = 0; i < products.length; i++){
            if(products[i] != null){
                System.out.println(i + "."+ products[i]);
            }
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten san pham: ");
        String product = scanner.nextLine();
        System.out.println("Nhap Gia: ");
        // double price = Double.parsedouble(scaner.nextline);
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap moTa");
        String moTa = scanner.nextLine();
        Product product1 = new Product(id, product, price ,moTa);
        iProductRepository.addProduct(product1);

    }

    @Override
    public void delete() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap ma product can khoa");
        int id = scanner.nextInt();
        iProductRepository.deleteProductById(id);
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap de tim kiem san pham");
        String search = scanner.nextLine();
        iProductRepository.searchProduct(search);
    }
}

