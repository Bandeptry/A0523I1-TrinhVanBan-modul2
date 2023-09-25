package Model;

import java.awt.*;

public class Car {
    private int id;
    private String nameCar;
    private Color color;
    private double kichThuoc;
    private boolean soTuDong;

    public Car(int id, String nameCar, String color, double kichThuc, boolean soTuDong) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(double kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public boolean isSoTuDong() {
        return soTuDong;
    }

    public void setSoTuDong(boolean soTuDong) {
        this.soTuDong = soTuDong;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", nameCar='" + nameCar + '\'' +
                ", color=" + color +
                ", kichThuoc=" + kichThuoc +
                ", soTuDong=" + soTuDong +
                '}';
    }
}
