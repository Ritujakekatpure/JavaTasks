import java.util.*;

public class GenericsTest {
	static void list1(List<Integer> list){
	    for (Integer num : list){
	        System.out.println(num);
	    }
	}
	static void list2(List<? super Integer> list){
	    for (Object num : list){
	        System.out.println(num);
	    }
	}
 
	public static void main(String args[]){	
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
        l1.add(3);

		List<Number> l2 = new ArrayList<Number>();
		l2.add(2.3);
		l2.add(3.4);
		l2.add(1.4);	
		System.out.println("List of Integer type using method 1:");
		list1(l1);
		System.out.println("List of Integer type using method 2:");;
		list2(l1);
		System.out.println("List of Number type using method 2:");
		list2(l2);
 
	}
}