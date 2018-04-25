package java1;

public class Item {
	
	private int artnumber;
	private double price;
	private String decription;
	private int balance;
	
	public Item(int artnumber, double price, String decription) {
		this.artnumber = artnumber;
		this.price = price;
		this.decription = decription;
	//	this.balance = balance;
	}
	
	public int getArtnumber() {
		return artnumber;
	}
	public void setArtnumber(int artnumber) {
		this.artnumber = artnumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getbalance() {
		return balance;
	}
	
	public String getDecription() {
		    return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}

	@Override
	public String toString() {
		return "Item [artikelnummer=" + artnumber + ", pris=" + price + ", beskrivning=" + decription + "]";
	}
	
	
	
	
	

}
