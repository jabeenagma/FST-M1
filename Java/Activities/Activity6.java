package acticvities;

public class Activity6 {
	public static void main(String[] args) throws InterruptedException {
		Plane plane=new Plane(10);
		plane.onboard("Nagma");
		plane.onboard("Nagma1");
		plane.onboard("Nagma2");
		plane.onboard("Nagma3");
		plane.onboard("Nagma4");
		plane.onboard("Nagma5");
		plane.onboard("Nagma6");
		plane.onboard("Nagma7");
		plane.onboard("Nagma8");
		plane.onboard("Nagma9");
		System.out.println("Plane Take Off at :"+plane.takeOff());
		System.out.println("List Of Passangers are: "+plane.getPassesngers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Plane landed at: " + plane.getLastTimeLanded());
	    System.out.println("People on the plane after landing: " + plane.getPassesngers());
	}

}
