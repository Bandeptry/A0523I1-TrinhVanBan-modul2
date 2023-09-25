package Controller;

public class ProductController {
    private int id;
    private String name;
    private long price;
    private String moTa;

    public ProductController() {
    }

    public ProductController(int id, String name, long price, String moTa) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.moTa = moTa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "ProductController{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
