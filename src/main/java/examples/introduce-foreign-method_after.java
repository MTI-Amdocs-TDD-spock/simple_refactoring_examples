package examples;

import java.util.Date;

class ReportAfter {
  private Date previousEnd;

  //...
  void sendReport() {
    Date newStart = nextDay(previousEnd);
    //...
  }
  private static Date nextDay(Date arg) {
    return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
  }
}