import java.util.ArrayList;
import java.util.HashSet;

public class ArraysLists1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Elements in Array " + list);
        HashSet<Integer> hs = new HashSet<>(list);
        System.out.println("Unique Elements " + hs);
    }
}
