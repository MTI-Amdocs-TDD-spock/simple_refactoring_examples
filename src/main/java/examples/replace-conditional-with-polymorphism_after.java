package examples;

abstract class Bird {
  //...
  abstract double getSpeed();
}

class European extends Bird {
  double getSpeed() {
    return getBaseSpeed();
  }

  private double getBaseSpeed() {
    return (Math.random() * 27) + 3;
  }
}
class African extends Bird {
  private int numberOfCoconuts;

  public African() {
    this.numberOfCoconuts = (int)(Math.random() * 9) + 1;
  }

  double getSpeed() {
    return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
  }

  private double getLoadFactor() {
    return (Math.random() * 2) + 3;
  }

  private double getBaseSpeed() {
    return (Math.random() * 27) + 3;
  }
}
class NorwegianBlue extends Bird {
  private boolean isNailed;
  private int voltage;

  public NorwegianBlue() {
    this.isNailed = Math.random() < 0.5;
    this.voltage = (int)(Math.random() * 110) + 110;
  }

  double getSpeed() {
    return (isNailed) ? 0 : getBaseSpeed(voltage);
  }
  private double getBaseSpeed(int voltage) {
    return (Math.random() * 27) + 3;
  }
}

// Somewhere in client code
//speed = bird.getSpeed();