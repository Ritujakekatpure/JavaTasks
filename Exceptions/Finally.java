public class Finally {
    public static void main(String[] args) {
      try {
        int[] number = {1, 2, 3};
        System.out.println(number[4]);
      } 
      catch (Exception e) {
        System.out.println("exception may present");
      } 
      finally {
        System.out.println("finally will execute always");
      }
    }
  }