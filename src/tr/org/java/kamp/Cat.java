package tr.org.java.kamp;

public class Cat extends Mammal implements Carnivore {
String furColor;
String eyeColor;
String catPsychology;
int age;
	public Cat(String name, String furColor,String catPsychology,String eyeColor, int age) {
		super(name);
		this.furColor=furColor;
		this.catPsychology=catPsychology;
		this.eyeColor=eyeColor;
		this.age=age;
		
		// TODO Auto-generated constructor stub
	}
public void claw(){
System.out.println(name +"yarak kürek");	
}
public void meow(){
System.out.println(name +"says meow");	
}
public void hunt() {
	// TODO Auto-generated method stub
	System.out.println(name +"hunts bird and mouse");	
}
public void giveBirth() {
	// TODO Auto-generated method stub
	System.out.println(name +"is giving birth for kitten");
}
public void breath() {
	// TODO Auto-generated method stub
	System.out.println(name +"it breaths");	
}
public void eat() {
	// TODO Auto-generated method stub
	System.out.println(name +"eats cat yemi");	
}
public void sleep() {
	// TODO Auto-generated method stub
	System.out.println(name +"sleeps grumpy");	
}
}
