package anOtherApplication;

public class HardCopyBook extends Book {
private double weight;
private double shippingCost;
	public HardCopyBook(String name, String author, String bookId) {
		super(name, author, bookId);
		// TODO Auto-generated constructor stub
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getShippingCost() {
		return shippingCost;
	}
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}
public String toString(){
	return isShippingCostHigh++"y"+"arak";
	
}
}
