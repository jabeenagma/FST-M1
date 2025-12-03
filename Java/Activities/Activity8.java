package activities3rdDec;

public class Activity8 {
public static void main(String[] args) {
	try {
		exceptionTest("Will print to console");
		exceptionTest(null);
	} catch (CustomException e) {
		// TODO Auto-generated catch block
		e.getMessage();
	}
}
public static void exceptionTest(String str) throws CustomException {
	if(str==null)
	   throw new CustomException("String is null");
	
	else
		System.out.println(str);
}
}
