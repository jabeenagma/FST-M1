package acticvities;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	private int maxPassengers;
	private List<String> passangers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;

	public Plane(int maxPassengers ) {
		this.maxPassengers = maxPassengers;
		passangers = new ArrayList<>();
	}

	public void onboard(String passangeName) {
		if(passangers.size()<=maxPassengers)
		    passangers.add(passangeName);
		else
			System.out.println("Plane is Full");
	}

	public Date takeOff() { 
		lastTimeTookOf=new Date();
		return lastTimeTookOf;
	}
	
	 
	  public void land() {
		  lastTimeLanded = new Date();
		  passangers.clear(); }
	  
	 
	public  Date getLastTimeLanded()
	{
		return lastTimeLanded;
	}

	
	public List<String> getPassesngers(){
		return passangers;
	}
}
