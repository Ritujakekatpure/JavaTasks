import java.util.*;
public class Maps1 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        for (char character : name.toCharArray()) {
            list.add(character);
        }

        Character c = ' ';
        list.remove(c);

        Map<Object , Integer> m = new TreeMap<>();
        for (Object o : list) {
            if (m.containsKey(o)) {
                int count = m.get(o) + 1;
                m.put(o, count);
            } else {
                m.put(o, 1);
            }
        }

        // System.out.println(map);
        for(Map.Entry<Object,Integer> e:m.entrySet())
		{
			System.out.println(e.getKey()+" -"+e.getValue());
		}

    }
}
