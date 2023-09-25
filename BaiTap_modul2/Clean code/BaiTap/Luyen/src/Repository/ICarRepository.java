package Repository;

import Model.Car;

public interface ICarRepository {
    Car[] displayCar();

    void addCar(Car nameCar);

    void searchCar(String nameCar);

    void deleteCar(String Car1);
}
