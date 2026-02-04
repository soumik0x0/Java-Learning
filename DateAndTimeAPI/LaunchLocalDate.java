import java.time.LocalDate;
import java.time.Month;

public class LaunchLocalDate {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    LocalDate customDate = LocalDate.of(1990, 2, 7);

    System.out.println(now);
    System.out.println(customDate);

    int dayOfMonth = now.getDayOfMonth();
    Month month = now.getMonth();
    int year = now.getYear();

    System.out.println(dayOfMonth);
    System.out.println(month);
    System.out.println(year);
  }
}
