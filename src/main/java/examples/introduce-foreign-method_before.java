package examples;

import java.util.Date;

class Report {
  private Date previousEnd;

  //...
  void sendReport() {
    Date nextDay = new Date(previousEnd.getYear(),
      previousEnd.getMonth(), previousEnd.getDate() + 1);
    //...
  }
}