package tr.org.java.kamp;

public class AnimalTest {
public static void main(String args[]){
	Cat sari = new Cat("Sari","Sari","efendi kedi","sari",3);
	Cat kara = new Cat("kara","siyah","efendi kedi","yesil",3);
		Dog fistik= new Dog("Fýstýk");
		Owl hedwig= new Owl("Hedwig");
		Snake husnu = new Snake("Husnu","Alengirli");
		fistik.bark();
		fistik.eat();
		sari.meow();
		husnu.crawl();
		System.out.println("Is cat kara mammal?"+isMammal(kara));
		System.out.println("Is owl husnu mammal?"+isMammal(husnu));
		
		
}
static boolean isMammal(Object obj){
	if(obj instanceof Mammal) return true;
	else return false;
}
}
