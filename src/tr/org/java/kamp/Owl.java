package tr.org.java.kamp;

public  class Owl extends Bird implements Herbivore {
public Owl(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

public void rotateHead270Degrees(){
	System.out.println(name +"rotates his head for 270 degrees..");	
}

public void fly() {
	// TODO Auto-generated method stub
	System.out.println(name +"it flysss");	
}

public void breath() {
	// TODO Auto-generated method stub
	System.out.println(name +"breathesss");	
}

public void eat() {
	// TODO Auto-generated method stub
	System.out.println(name +"eats vamp.");	
}

public void sleep() {
	// TODO Auto-generated method stub
	
}

public void investigatePlant() {
	// TODO Auto-generated method stub
	
}
}
