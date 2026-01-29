public class LaunchString3 {
  public static void main(String[] args) {
    String str = "RajaRamMohanRoy";
    System.out.println(str.length());
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    System.out.println(str.substring(4));
    System.out.println(str.substring(4, 12));

    char ch[] = str.toCharArray();
    for (char c : ch) {
      System.out.println(c);
    }

    System.out.println(str.charAt(4));
    System.out.println(str.contains("Mohan"));
    //startsWith
    //indexOf -> gives you starting index
    //lastIndexOf -> gives you the last index
  }
}
