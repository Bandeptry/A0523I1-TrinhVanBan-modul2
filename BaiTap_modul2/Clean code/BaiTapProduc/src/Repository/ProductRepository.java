package Repository;

import Model.Product;

public class ProductRepository implements IProductRepository {
    private static Product[] products = new Product[20];
    static {
        products[0] = new Product(1,"LapTop",12000,"ok");
        products[1] = new Product(2,"Smatphone",10000,"good");
        products[2] = new Product(3,"IPad",11000,"ex");
    }

    public Product[] getListProduct() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        for (int i = 0; i < products.length;i++){
            if(products[i] == null){
                products[i] = product;
            }
        }
    }

    @Override
    public void deleteProductById(int id) {
        for(int i = 0; i < products.length; i++){
            if(products[i].getId() == id){
                products[i] = null;
            }
        }
    }

    @Override
    public void searchProduct(String nameProduct) {
        for (int i = 0; i < products.length; i++){
            if(products[i].getName().equals(nameProduct)){
                System.out.println(products[i]);
            }
        }
    }
}
