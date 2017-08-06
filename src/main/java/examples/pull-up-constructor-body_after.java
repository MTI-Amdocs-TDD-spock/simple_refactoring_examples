package examples;

import shared_classes.SharedEmployee;

class Manager extends SharedEmployee {
  public Manager(String name, String id, int grade) {
    super(name, id);
    this.grade = grade;
  }
  //...
}