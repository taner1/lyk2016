package tr.org.java.kamp;

public class Dog extends Mammal implements Carnivore {
public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
public void bark() {
	System.out.println(name +"make sound of hav hav");	
}
public void sniff(){
	System.out.println(name +"sniff and trace-catch");	
}
public void hunt() {
	// TODO Auto-generated method stub
	System.out.println(name +"hunts good");	
}
public void giveBirth() {
	// TODO Auto-generated method stub
	System.out.println(name +"give birth for puppies");	
}
public void breath() {
	// TODO Auto-generated method stub
	System.out.println(name +"breathes loudly");	
}
public void eat() {
	// TODO Auto-generated method stub
	System.out.println(name +"eats bone");	
}
public void sleep() {
	// TODO Auto-generated method stub
	System.out.println(name +"sleeps");	
}
}
