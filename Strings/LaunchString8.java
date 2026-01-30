public class LaunchString8 {
  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer();
    System.out.println(sb1.capacity()); //default -> 16
    sb1.append("Sachin");
    sb1.append("Tendulkar India");
    System.out.println(sb1);
    System.out.println(sb1.capacity()); //now -> old capacity * 2 + 2 = 34
    sb1.trimToSize();
    System.out.println(sb1.capacity());

    StringBuilder sb2 = new StringBuilder();
    System.out.println(sb2.capacity());
  }
}
