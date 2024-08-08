package model.vo;

public class Product {

	
	//鞘靛何
	private String productName;
	private int price;
	private int amount;
	
	//积己磊何
	public Product(){}

	public Product(String productName, int price, int amount) {
		super();
		this.productName = productName;
		this.price = price;
		this.amount = amount;
	}



	//getter,setter
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", amount=" + amount + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
