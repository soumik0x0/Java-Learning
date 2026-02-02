import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LaunchStream {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(14);
    list.add(5);
    list.add(72);
    list.add(18);
    list.add(12);

    System.out.println(list);
    // Collections.sort(list);
    // System.out.println(list);

    // Stream<Integer> streamData1 = list.stream();
    // Stream<Integer> sortedStream = streamData1.sorted();
    // sortedStream.forEach(n -> System.out.println(n));
    // System.out.println(list);
    // Stream<Integer> streamData2 = sortedStream.map(n -> n * 2);
    // streamData2.forEach(n -> System.out.println(n));
    
    //stream -> only single use and single operation

    list.stream()
        .sorted()
        .map(n -> n * 2)
        .forEach(n -> System.out.println(n));

    String n1 = "Alien";
    int length = n1.toLowerCase()
                .toUpperCase()
                .concat("Java")
                .length();

    System.out.println(length);

    List<String> list2 = new ArrayList<>();

    list2.add("Alien");
    list2.add("Java");
    list2.add("Telusko");

    System.out.println(list2);

    Set<String> set = list2.stream().collect(Collectors.toSet());
    System.out.println(set);
  }
}
