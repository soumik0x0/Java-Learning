public class LaunchString1 {
  public static void main(String[] args) {
    String str1 = "Telusko";
    String str2 = "Telusko";
    System.out.println(str1==str2); //true
    //created in string constant pool and same address is given
    //to both str1 and str2 "==" is used to compare the addresses hence true

    String str3 = new String("Telusko");
    String str4 = new String("Telusko");
    System.out.println(str3==str4); //false
    //duplication is allowed in heap area and the address of both str3 and str4 is different

    System.out.println(str3.equals(str4)); //true as equals() compare the content only

    String str5 = "Telusko";
    String str6 = new String("Telusko");
    System.out.println(str5.equals(str6)); //true
    System.out.println(str5 == str6); //false

    String str7 = "Telusko";
    String str8 = "telusko";
    System.out.println(str7.equals(str8)); //false
    System.out.println(str7 == str8); //false
    System.out.println(str7.equalsIgnoreCase(str8)); //true
  }
}