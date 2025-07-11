package Structural.Facade.Classes;

import Structural.Facade.Interface.ProductDao;

public class ProductDaoImpl implements ProductDao{

    @Override
    public Product getProduct(int productId) {
        return new Product();
    }
    
}
