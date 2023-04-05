import java.util.*;
public class ArrayLists {
    public static void main(String[] args)

    {

       List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(1);
       list.add(2);
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       System.out.println("Elements in Array " + list);
      List<Integer> list1 = new ArrayList<>();
      for(int i=0;i<list.size();i++)
      {
        int x;
          if(!list1.contains(list.get(i)))
          {
             x=list.get(i);
             list1.add(x);
          }
      }
       System.out.println("Array with unique element " + list1);

    }
}