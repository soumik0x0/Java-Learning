import java.time.LocalTime;

public class LaunchLocalTime {
  public static void main(String[] args) {
    LocalTime now = LocalTime.now();
    System.out.println(now);

    LocalTime customTime = LocalTime.of(14, 30);
    System.out.println(customTime);

    String timeInString = "15:30:45";
    LocalTime parsedStringTime = LocalTime.parse(timeInString);
    System.out.println(parsedStringTime);

    LocalTime beforeOneHour = now.minusHours(1);
    System.out.println(beforeOneHour);

    if (now.isAfter(beforeOneHour)) {
      System.out.println("Haan Bhai");
    }
  }
}
