package activities3rdDec;

import java.util.ArrayList;

public class Activity9 {

public static void main(String[] args) {
	ArrayList<String> myList =new ArrayList<String>();
	myList.add("Nagma");
	myList.add("Sita");
	myList.add("Geeta");
	myList.add("Babita");
	myList.add("Priya");
	
	for(String lst:myList) {
		System.out.println(lst);
	}
	System.out.println("Third Name in the list is :"+myList.get(2));
	System.out.println("Is Priya contains in List :"+myList.contains("Priya"));
	System.out.println("Numbers of name is :"+myList.size());
	myList.remove("Sita");
	System.out.println("Numbers of name after removing :"+myList.size());
}
}
