package java1;

public class Item {
	
	private int artnumber;
	private int price;
	private String decription;
	
	public Item(int artnumber, int price, String decription) {
		this.artnumber = artnumber;
		this.price = price;
		this.decription = decription;
	}
	
	public int getArtnumber() {
		return artnumber;
	}
	public void setArtnumber(int artnumber) {
		this.artnumber = artnumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}

	@Override
	public String toString() {
		return "Item [artnumber=" + artnumber + ", price=" + price + ", decription=" + decription + "]";
	}
	
	
	
	
	

}
