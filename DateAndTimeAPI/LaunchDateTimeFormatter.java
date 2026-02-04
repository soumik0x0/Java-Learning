package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LaunchDateTimeFormatter {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String format = now.format(myFormatter);
    System.out.println(format);

    // String date = "25/04/1998";
    // DateTimeFormatter myFormatter1 = DateTimeFormatter.ofPattern("dd/MM/YYYY");
    // LocalDate parse = LocalDate.parse(date, myFormatter1);
    // System.out.println(parse);
  }
}
