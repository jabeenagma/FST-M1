package acticvities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car() {
		this.tyres=4;
		this.doors=4;
	}
	
	public void displayCharacteristics() {
		System.out.println("Color of Car is :"+color);
		System.out.println("transmission of Car is :"+transmission);
		System.out.println("make of Car is :"+make);
		System.out.println("Number of tyres in the Car is :"+tyres);
		System.out.println("Number of doors in the Car is :"+doors);
	}
    public void accelarate() {
		System.out.println("Car is moving forward.");
	}
    
    public void brake() {
    	System.out.println("Car has stopped.");
	}


}
