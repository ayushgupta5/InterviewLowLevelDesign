package Service.Product;

import Model.Product.Product;

public class ProductService implements IProductService {
    @Override
    public void getDetails(Product product) {
        System.out.println("Getting the Product Details : " +product.toString());
    }

    @Override
    public void updateStock(Product product) {
        System.out.println("Updating the Stock of the Product : " +product.toString());
    }
}
