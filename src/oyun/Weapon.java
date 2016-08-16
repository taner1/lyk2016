package oyun;

public class Weapon extends Item {
private double damageAmount;
	public Weapon(double price, double weight,double damage) {
		super(price, weight);
		if(damageAmount<0) damage=0;
			else this.damageAmount=damage;
		}
	
		// TODO Auto-generated constructor stub

	@Override
	protected boolean useItem() {
		return false;
	}

	public double getDamageAmount() {
		return damageAmount;
	}
	public String toString(){
	return getItemPrice()+ "is the price of item and it weighs"+getItemWeight()+"also damage amount is"+getDamageAmount();
	}
}
