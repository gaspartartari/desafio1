package com.learning.desafio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.desafio1.entities.Order;

@Service
public class OrderService {
    
    @Autowired
    private ShippingService shippingService;

    public Double total (Order order){
        Double shippingRate = shippingService.shipment(order);
        Double discount = (order.getBasic() / 100) * order.getDiscount();
        return order.getBasic() - discount + shippingRate;
    }
}
