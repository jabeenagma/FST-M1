package activities3rdDec;

import java.util.HashSet;
import java.util.Set;


public class Activity10 {

	public static void main(String[] args) {
		Set<Integer> hs=new HashSet<Integer>();
		hs.add(20);
		hs.add(20);
		hs.add(4);
		hs.add(1);
		hs.add(4);
		hs.add(90);
		System.out.println(hs);
		System.out.println("Size of Set is :"+hs.size());
		hs.remove(4);
		if(hs.remove(8)) {
			System.out.println("8 removed from the Set");
        } else {
        	System.out.println("8 is not present in the Set");
      
		}
		System.out.println("Is 4 present in set :"+hs.contains(4));
		
		System.out.println(hs);
	}
}
