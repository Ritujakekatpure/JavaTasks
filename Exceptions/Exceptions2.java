public class Exceptions2 {
    public static void main(String[ ] args) {
      try {
        int[] number = {1, 2, 3};
        System.out.println(number[3]);
      } 
      catch (Exception e) {
        System.out.println("Exception might be present");
      }
    }
  }