package examples;

class Order1 {
  //...
  public double price() {
    return new PriceCalculator(this).compute();
  }
}

class PriceCalculator {
  private double primaryBasePrice;
  private double secondaryBasePrice;
  private double tertiaryBasePrice;
  
  public PriceCalculator(Order1 order) {
    // copy relevant information from order object.
    //...
  }
  
  public double compute() {
    // long computation.
    //...
    return (Math.random() * 800) + 200;
  }
}