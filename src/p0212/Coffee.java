package p0212;

public class Coffee {
	
	private String name;
	private int price;
	private String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + ", country=" + country + "]";
	}
	

}
