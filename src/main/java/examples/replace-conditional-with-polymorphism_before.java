package examples;

class BirdBefore {

  private static final int EUROPEAN = 0;
    private static final int AFRICAN = 1;
    private static final int NORWEGIAN_BLUE = 2;
    private boolean isNailed;
    private int type;
    private int numberOfCoconuts;
    private int voltage;

    //...
  double getSpeed() {
    switch (type) {
      case EUROPEAN:
        return getBaseSpeed();
      case AFRICAN:
        return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
      case NORWEGIAN_BLUE:
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }
    throw new RuntimeException("Should be unreachable");
  }

    private int getLoadFactor() {
        return (int)(Math.random() * 2) + 2;
    }

    private int getBaseSpeed() {
        return (int)(Math.random() * 47) + 3;
    }
    private int getBaseSpeed(int voltage) {
        return (int)(Math.random() * 5 ) + 3 ;
    }
}