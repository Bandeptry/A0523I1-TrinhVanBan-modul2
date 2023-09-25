package Repository;

import Model.Car;

public class CarRepository implements ICarRepository{
   public static Car[] car = new Car[30];
   static {
       car[0] = new Car(1, "postcher", "red", 8.5, true);
       car[1] = new Car(2, "toyotad", "white",8.0, false);
       car[2] = new Car(3, "mesedex", "pink", 9.5, true);
   }

    @Override
    public Car[] displayCar() {
        return car;
    }

    @Override
    public void addCar(Car nameCar) {
        for (int i = 0; i < car.length; i++){
            if(car[i] == null){
                car[i] = nameCar;
                break;
            }
    }
}

    @Override
    public void searchCar(String nameCar) {
        for(int i = 0; i < car.length; i++){
            if(car[i].getNameCar().equals(nameCar)){
                System.out.println(car[i] );
            }
        }
    }

    @Override
    public void deleteCar(String Car1) {
        for (int i = 0; i < car.length; i++){
            if(car[i].getNameCar() == Car1){
                car[i] = null;
            }
        }
    }
}
