package tr.org.java.kamp;
public class Snake extends Reptile implements Carnivore
{
	String tipi;
public Snake(String name, String tipi) {
		super(name);
		this.tipi=tipi;
		// TODO Auto-generated constructor stub
	}
public void poison(){
	System.out.println(name +"can be poison to death");	
	
}
public void hunt() {
	// TODO Auto-generated method stub
	System.out.println(name +"hunts silently");	
}
public void crawl() {
	// TODO Auto-generated method stub
	System.out.println(name +"crawling good");	
}
public void breath() {
	// TODO Auto-generated method stub
	System.out.println(name +"breath in mouth");	
}
public void eat() {
	// TODO Auto-generated method stub
	System.out.println(name +"can eat bigger than hisself");	
}
public void sleep() {
	// TODO Auto-generated method stub
	System.out.println(name +"never sleeps");	
}
}
