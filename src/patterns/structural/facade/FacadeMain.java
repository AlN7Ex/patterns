package patterns.structural.facade;

import patterns.structural.facade.service.PaymentService;
import patterns.structural.facade.service.ShippingService;
import patterns.structural.facade.service.WarehouseService;

public class FacadeMain {
    public static void main(String[] args) {
        OrderServiceFacadeImpl orderServiceFacade = new OrderServiceFacadeImpl(
                new PaymentService(),
                new ShippingService(),
                new WarehouseService());
        String result = orderServiceFacade.handleOrder(1);
        System.out.println(result);
    }
}
