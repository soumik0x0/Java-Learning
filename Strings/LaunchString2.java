public class LaunchString2 {
  public static void main(String[] args) {
    String str1 = "Telusko";
    System.out.println(str1);

    str1.concat("Alien");
    System.out.println(str1); //Telusko cuz in string constant pool

    str1 = str1.concat("Alien");
    System.out.println(str1); //TeluskoAlien

    //String Constant Pool is last one to be collected by GC

    String s1 = "Telusko";
    String s2 = s1.concat("Java"); //reference -> heap area
    //String s3 = s1 + s2; //heap area
    String s3 = "Telusko Java"; //String Constant Pool

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    String s4 = s1 + s2; //reference -> heap area
    System.out.println(s3 == s4); //false

    String s = "Springboot" + 2500 + 3900 + 4500; //int becomes string
    System.out.println(s);

    String ss = 45 + 55 + "Telusko"; //addition first and then Telusko added
    System.out.println(ss);
  }
}
