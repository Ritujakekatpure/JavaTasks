import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> m=new HashMap<>();
		int x[]= {1,1,2,2,3,4,5,5,5};
		
		for(int i:x)
		{
			if(m.containsKey(i))
			{
				m.put(i,m.get(i)+1);
			}
			else
			{
				m.put(i,1);
			}
		}
		for(Map.Entry<Integer,Integer> e:m.entrySet())
		{
			System.out.println(e.getKey()+" -"+e.getValue());
		}
	}
	}