package activities3rdDec;

public class Activity12 {
public static void main(String[] args) {
	Addable ad1= (n1,n2)->n1+n2;
	System.out.println(ad1.add(10, 30));
	Addable ad2= (n1,n2)->{
		return (n1+n2);
		};
    System.out.println(ad2.add(90, 40));
}
}
