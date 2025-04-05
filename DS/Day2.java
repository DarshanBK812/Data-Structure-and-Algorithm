package DS;
import java.util.*;
public class Day2 {
	public static void main(String args []) {
		Collection<String> s1 = new ArrayList();
		s1.add("hi");
		s1.add("hello");
		
		Collection<String> s2 = new HashSet();
		s2.add("A");
		s2.add("b");
		s2.add("c");
		
		s2.addAll(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		List l = new ArrayList<>();
		l.add(Integer.valueOf(1));
		l.add(String.valueOf("Scaller"));
		System.out.println(l);
	}

}
