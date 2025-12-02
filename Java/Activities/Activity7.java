package acticvities;

public class Activity7 {
	public static void main(String[] args) {
		MountainBike mountainbike = new MountainBike(3,0,25);
		System.out.println(mountainbike.bicycleDesc());
		mountainbike.speedUp(20);
		mountainbike.applyBrake(5);
	}
}
