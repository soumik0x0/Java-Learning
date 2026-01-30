public class LaunchString9 {
  public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder("Sachin");
    System.out.println(sb1.capacity());

    StringBuilder sb2 = new StringBuilder("Sachin");
    System.out.println(sb1.equals(sb2)); //equals() -> compare references in this case of stringbuilder

    StringBuffer sb3 = new StringBuffer("Sachin");
    StringBuffer sb4 = new StringBuffer("Sachin"); //equals() -> compare references in this case of stringbuffer
    System.out.println(sb3.equals(sb4));

    //stringbuffer -> multi-threading not allowed
    //stringbuilder -> multi-threading allowed
  }
}
