import java.util.HashSet;

public class Sets {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,1,2,3,3,3,3};
		HashSet<Integer> se=new HashSet<>();
		for(int element:arr)
		{
			se.add(element);
		}
		System.out.println("Unique elements " +se);
	}

}