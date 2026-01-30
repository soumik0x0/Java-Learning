public class LaunchString6 {
  public static void main(String[] args) {
    String s1 = "RajaRamMohanRoy";

    String[] str = s1.split("a");

    for (String s : str) {
      System.out.print(s);
    }
    System.out.println();

    String s2 = "   Raja Ram Mohan Roy  ";
    System.out.println(s2);
    System.out.println(s2.trim());
    System.out.println(s2.stripLeading());
    System.out.println(s2.stripTrailing());
  }
}
