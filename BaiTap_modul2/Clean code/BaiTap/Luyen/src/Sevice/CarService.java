package Sevice;

import Model.Car;
import Repository.CarRepository;
import Repository.ICarRepository;

import java.util.Scanner;

public class CarService implements ICarService{
    private ICarRepository iCarRepository = new CarRepository();

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id Car:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ten Car");
        String nameCar = scanner.nextLine();
        System.out.println("Mau car");
        String color = scanner.nextLine();
        System.out.println("Kich thuoc car");
        double length = scanner.nextDouble();
        System.out.println("co so tu dong khong");
        boolean auto = Boolean.parseBoolean(scanner.nextLine());
        Car cars = new Car(id, nameCar, color,length, auto);
        iCarRepository.addCar(cars);
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap hang xe");
        String nameCar = scanner.nextLine();
        iCarRepository.searchCar(nameCar);
    }

    @Override
    public void display() {
        Car[] cars = iCarRepository.displayCar();
        for (int i = 0; i < cars.length; i++){
            if(cars[i] != null)
                System.out.println((1 + i) + ". "+cars[i]);
        }
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap car can xoa");
        String xoaCar = scanner.nextLine();
        iCarRepository.deleteCar(xoaCar);
    }
}
