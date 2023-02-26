package patterns.structural.facade;

import patterns.structural.facade.service.PaymentService;
import patterns.structural.facade.service.ShippingService;
import patterns.structural.facade.service.WarehouseService;
public class OrderServiceFacadeImpl implements OrderServiceFacade {
    private final PaymentService paymentService;
    private final ShippingService shippingService;
    private final WarehouseService warehouseService;

    public OrderServiceFacadeImpl(PaymentService paymentService,
                                  ShippingService shippingService,
                                  WarehouseService warehouseService) {
        this.paymentService = paymentService;
        this.shippingService = shippingService;
        this.warehouseService = warehouseService;
    }
    @Override
    public String handleOrder(int product_id) {
        Product product = warehouseService.isExist(product_id);
        if (product == null) {
            return "Not exist id: " + product_id;
        }
        boolean confirmed = paymentService.makePayment();
        if (!confirmed) {
            return "Payment failed";
        }
        return shippingService.shipProduct(product);
    }
}
