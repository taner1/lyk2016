package oyun;
public class Armor extends Item implements Upgradable {
private double defencePoints;
private boolean isWorn;
public Armor(double price,double weight,double defencePoints)
{
super(price,weight);
if(defencePoints > 0) this.defencePoints=defencePoints;
else{ this.defencePoints=0;
isWorn=false;}
}
public double getDefencePoints() {
	return defencePoints;
}
public void upgrade(){
	defencePoints +=100;
}
public boolean isWorn() {
	return isWorn;
}
public boolean useItem(){
	isWorn=true;
	return true;
}
public double getHit(double damagePoints) {
	if(isWorn=true){
		if(defencePoints>=damagePoints) {
			defencePoints -= damagePoints;
			return 0;
		}
		if(defencePoints<damagePoints) {
			defencePoints=0;
		return damagePoints-defencePoints;
		}
		
}
	return damagePoints;
}
public String toString(){
	return "Armor has" + getDefencePoints()+"defence points and"+ getItemPrice()+ "is the price of item and it weighs" + getItemWeight();
	}
}
