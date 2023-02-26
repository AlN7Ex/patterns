package patterns.structural.facade.service;

import patterns.structural.facade.Product;

public class WarehouseService {
    public Product isExist(int product_id) {
        return product_id == 1 ? new Product(1, "something") : null;
    }
}
