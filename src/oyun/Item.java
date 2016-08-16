package oyun;

public abstract class Item {
	private static int ItemQuantity=0;
 private double itemPrice;
  private double itemWeight;
   public Item(double price,double weight) {
	   if(price>= 0) this.itemPrice=price;
	   else itemPrice=0;
	   if(weight>=0) this.itemWeight=weight;//constructor 
	   else itemWeight=0;
	   ItemQuantity++;
   }
protected abstract boolean useItem();
	public static int getItemQuantity() {
		return ItemQuantity;
	}


	public  double getItemPrice() {
		return itemPrice;
	}



	public  double getItemWeight() {
		return itemWeight;
	}


}
