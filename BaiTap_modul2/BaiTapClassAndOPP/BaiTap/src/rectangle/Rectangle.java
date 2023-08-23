package rectangle;

class Rectangle {
    private double width, height;
    public Rectangle(){//khoi tao constructer trong de the hien rang: sua doi gia tri mac dinh, ma chi su dung gia tri cu the

    }
    public Rectangle(double height, double width){//khoi tao constructer trong de the hien rang: sua doi gia tri mac dinh
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return 2 * (width + height);
    }

    public double getPerimeter(){
        return width * height;
    }

    public String display(){
        return "height : "+height+" and width: "+width;
    }
}


