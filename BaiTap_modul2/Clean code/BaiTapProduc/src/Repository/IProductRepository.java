package Repository;

import Model.Product;

public interface IProductRepository {
    Product[] getListProduct();

    void addProduct(Product product);

    void deleteProductById(int product);

    void searchProduct(String nameProduct);
}
