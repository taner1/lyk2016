package oyun;

public class Bow extends Weapon implements Upgradable {
private int numArrows;
	public Bow(double price, double weight, double damage,int numArrows) {
		super(price, weight, damage);
		if(numArrows<0) numArrows=0;
		else this.numArrows=numArrows;
		
		// TODO Auto-generated constructor stub
	}
	public int getNumArrows() {
		return numArrows;
	}
	public void upgrade(){
		numArrows+=10;
	}
public boolean useItem()
{
	if(numArrows > 0){ System.out.println("The bow thrown and caused the damage of "
+ getDamageAmount());
		numArrows--;
		return true;
	}
	else return false;
}
public String toString(){
	return "Weapon type: Bow and remaining bows="
+getNumArrows()+
super.toString();
}
}
