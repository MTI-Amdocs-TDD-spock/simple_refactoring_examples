package examples;

import shared_classes.Order;

class InlineTempBefore{

    boolean hasDiscount(Order order) {
        double basePrice = order.basePrice();
        return (basePrice > 1000);
    }
}
