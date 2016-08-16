package oyun2;

public class Plane extends Vehicle {
protected int maximumFeet;
protected String flightCode;
protected boolean isAutoPilotActive;
public Plane(String GasType,int maximumFeet,String flightCode,boolean isAutoPilotActive){
	
}
public enum liftOffType {
	HORIZONTAL,VERTICAL
}
public void printPlane(){
	System.out.println("marka"+brand,"model"+model,"hiz"+speed+"maks yukseklik"+maximumFeet+"ucus kodu"+id+"otopilot aktif mi"+isAutoPilotActive);
}
}
