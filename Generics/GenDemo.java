import java.util. * ;
public class GenDemo{
  public static void main(String[] args) {
    
    List<Integer> intList = Arrays.asList(10,20,30,40);
    List<String> strList = Arrays.asList("a","b","c","d");
    List<Double> doubleList = Arrays.asList(11.5,13.6,67.8,43.7);

    printList(intList);
    printList(doubleList);
    printList(strList);

  }
  private static void printList(List <?>list) {
    System.out.println(list);
  }
}