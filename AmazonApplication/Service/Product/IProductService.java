package Service.Product;

import Model.Product.Product;

public interface IProductService {
    void getDetails(Product product);
    void updateStock(Product product);
}
