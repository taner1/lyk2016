package enumdeneme;

public class EnumTest {
Day day;
public EnumTest(Day day) {
	this.day=day;
}
public void tellItLikeItIs() {
	switch(day){
	case MONDAY: System.out.println("Monday sucks");
	case FRIDAY:System.out.println("asdadasdas");
	case SATURDAY: case SUNDAY: System.out.println("tatil");
	default:
		System.out.println("asdasda");
		break;
	
}
}
public static void main(String args[]){
	EnumTest firstDay = new EnumTest(Day.MONDAY);
	firstDay.tellItLikeItIs();
}
}