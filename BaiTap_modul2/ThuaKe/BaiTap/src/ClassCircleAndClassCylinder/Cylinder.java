package ClassCircleAndClassCylinder;

public class Cylinder extends Circle {
    private double height = 1.0;
    public Cylinder(){
    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double theTich(){
        return height * Math.pow(getRadius(), 2) + Math.PI;
    }

    @Override
    public String toString() {
        return "Chieu cao cua hinh tru :" + height +
                ", " + super.toString();
    }
}
