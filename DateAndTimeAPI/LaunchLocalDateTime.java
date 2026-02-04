import java.time.LocalDateTime;

public class LaunchLocalDateTime {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);

    LocalDateTime myDate = LocalDateTime.parse("2023-01-11T13:48");
    System.out.println(myDate);
  }
}
