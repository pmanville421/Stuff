/**
 * 
 */
package model;

/**
 * @author pmanville
 *
 */
public class Item {

	private String sku;
	private String productType;
	private String flavor;
	private double cost;
	private double price;
	private int quantity;
	
	
	/**
	 *
	 */	
	public Item() {
		this.sku = "None";
		this.productType = "None";
		this.flavor = "None";
		this.cost = 0;
		this.price = 0;
		this.quantity = 0;
	}
		
	/**
	 * @param sku
	 * @param productType
	 * @param flavor
	 * @param cost
	 * @param price
	 * @param quantity
	 */	
	public Item(String sku, String productType, String flavor, double cost, double price, int quantity) {
		this.sku = sku;
		this.productType = productType;
		this.flavor = flavor;
		this.cost = cost;
		this.price = price;
		this.quantity = quantity;
	}


	public String getSku() {
		return sku;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public String getFlavor() {
		return flavor;
	}


	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Item [sku=" + sku + ", productType=" + productType + ", flavor=" + flavor + ", cost=" + cost
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}
