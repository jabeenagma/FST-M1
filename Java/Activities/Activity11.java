package activities3rdDec;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
	public static void main(String[] args) {
		Map<Integer,String> colours =new HashMap<Integer, String>();
		colours.put(1, "Pink");
		colours.put(2, "Yellow");
		colours.put(3, "Green");
		colours.put(4, "white");
		colours.put(5, "Black");
		System.out.println(colours);
		colours.remove(5);
		System.out.println(colours);
		System.out.println("Is Black color present :"+colours.containsValue("Black"));
		System.out.println("Size:"+colours.size());
	}

}
