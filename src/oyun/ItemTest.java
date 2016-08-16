package oyun;

public class ItemTest extends Item {
public ItemTest(double price, double weight) {
		super(price, weight);
		// TODO Auto-generated constructor stub
	}

public static void main(String args[]){
	System.out.println("Number of items before creating");
	Armor armor = new Armor(100,50,200);
	Sword sword = new Sword(50,20,40);
	Bow bow = new Bow(20,5,2,5);
	System.out.println("Number of item after creating"+ getItemQuantity());
	System.out.println(armor);
	System.out.println(sword);
	System.out.println(bow);
}

@Override
protected boolean useItem() {
	// TODO Auto-generated method stub
	return false;
}
}
