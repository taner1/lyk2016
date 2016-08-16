package oyun;

public class Sword extends Weapon {

	public Sword(double price, double weight,double damage) {
		super(price, weight, damage);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean useItem() {
		// TODO Auto-generated method stub
		System.out.println("Sword is on use cause damage"+getDamageAmount());
		return true;
	}
public String toString(){
	return "Weapon type: Sword:"+
super.toString();
}
}
