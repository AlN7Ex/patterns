package patterns.structural.facade.service;

import patterns.structural.facade.Product;

public class ShippingService {
    public String shipProduct(Product product) {
        return product.toString();
    }
}
