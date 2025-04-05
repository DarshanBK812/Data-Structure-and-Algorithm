package DS;
import java.util.*;

public class ArrayListD2 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(3);
		l.add(4);
		
		l.add(1, 2);
	
		System.out.println(l);
		List<Integer> l2 = new ArrayList<>();
		l2.add(13);
		l2.add(14);
		l2.addAll(l);
		
		System.out.println(l2);
		
		//remove a list value
		l.remove(1);
		l.remove(Integer.valueOf(1));
		System.out.println(l);
		
		//contains will check the value present the list
		if(l2.contains(14)) {
			l2.remove(Integer.valueOf(14));
			System.out.println(l2);
			
		}
		else {
			l2.add(5 , 14);
			System.out.println(l2);
		}
		l2.set(0, 0);
		System.out.println(l2.indexOf(0));
		// get is used to grt the value from list
//		for(int i =0;i<l2.size();i++) {
//			System.out.println(l2.get(i));
//		}
		
		
		for(Integer x : l2) {
			System.out.println(x);
		}
		
	}

}
