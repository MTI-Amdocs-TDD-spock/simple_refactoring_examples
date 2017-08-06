package examples;

import shared_classes.SharedEmployee;

class ManagerBefore extends SharedEmployee{
  private final String name;
  private final String id;
  private final int grade;

  public ManagerBefore(String name, String id, int grade) {
    this.name = name;
    this.id = id;
    this.grade = grade;
  }
  //...
}