package examples;

class Range1Before {
  private int low, high;
  boolean includes(int arg) {
    return arg >= low && arg <= high;
  }
}