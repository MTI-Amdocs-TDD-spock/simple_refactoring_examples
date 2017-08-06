package examples;

import shared_classes.Order;

class InlineTempAfter{

    boolean hasDiscount(Order order) {
        return (order.basePrice() > 1000);
    }
}
