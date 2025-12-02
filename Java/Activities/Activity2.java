package acticvities;

public class Activity2 {
	public static void main(String[] args) {
		int[] arr= {10, 77, 10, 54, -11, 10};
		int sum=0;
		for(int ar:arr) {
			if(isNumberTen(ar)) {
				sum+=ar;
			}
		}
		if(sum==30)
		    System.out.println("The Sum is equal to 30");
		else
			System.out.println("The Sum is not equal to 30");
			
	}
	
	public static boolean isNumberTen(int num) {
		if(num==10)
			return true;
		else
			return false;
					
		
	}

}
