public class LaunchString5 {
  public static void main(String[] args) {
    final String s1 = "Telusko";
    String s2 = s1 + " Java";
    System.out.println(s2);

    //compareTo() -> compares the value of strings lexicographically
    String s3 = "SACHIN";
    String s4 = "SACHIN";
    System.out.println(s3.compareTo(s4)); // -> output : 0 -> strings are equal

    String s5 = "VIRAT"; //86 73 82 65 84
    String s6 = "DHONI"; //68 72 79 78 73
    System.out.println(s5.compareTo(s6)); //86 - 68 :-> first occurence of difference
  }
}
