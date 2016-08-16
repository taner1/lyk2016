package oyun2;

public abstract class Vehicle {
protected int id;
	protected String brand;
protected String model;
protected int speed;
protected int capacity;
protected int numberOfWheels;
protected boolean hasAerofoil;
protected boolean hasAutopilot;
public enum GasType {
GASOLINE,LPG,DIESEL_FUEL,JET_FUEL
}
public Vehicle(){
	
}
public Vehicle(int speed,String brand,String model) {
	this.speed=speed;
	this.brand=brand;
	this.model=model;
}
public Vehicle(String brand,String model,int speed,int capacity,int numberOfWheels,boolean hasAerofoil,boolean hasAutopilot){
	this.brand=brand;
	this.model=model;
	this.speed=speed;
	this.capacity=capacity;
	this.numberOfWheels=numberOfWheels;
	this.hasAerofoil=hasAerofoil;
	this.hasAutopilot=hasAutopilot;
	
}

}
