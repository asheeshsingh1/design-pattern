package Structural.Facade.Interface;

import Structural.Facade.Classes.Product;

public interface ProductDao {
    Product getProduct(int productId);
}
