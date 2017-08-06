package examples;

class Employee {

    private Employee(int type) {
    }

    static Employee create(int type) {
    Employee employee = new Employee(type);
    // do some heavy lifting.
    return employee;
  }
  //...
}