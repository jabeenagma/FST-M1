package acticvities;

public class MountainBike extends Bicycle{
	int seatHeight;

	public MountainBike(int gears, int currentSpeed,int seatHeight) {
		super(gears, currentSpeed);
		this.seatHeight=seatHeight;
	}
	
	public void setHeight(int newHeight) {
		seatHeight=newHeight;
	}
	
	@Override
	public String bicycleDesc() {
		return(super.bicycleDesc()+ "\nSeat Height of bicycle is "+seatHeight);
	}

}
