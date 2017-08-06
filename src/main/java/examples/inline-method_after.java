package examples;

class PizzaDelivery {
  private int numberOfLateDeliveries;

  //...
  int getRating() {
    return numberOfLateDeliveries > 5 ? 2 : 1;
  }
}