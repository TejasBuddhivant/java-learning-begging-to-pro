package test.test;

import javax.persistence.Embeddable;

@Embeddable
public class address_embeddable {

	private int pincode;
	private String area;
	private String city;
	private String village;


	
	public address_embeddable(int pincode, String area, String city, String village) {
		super();
		this.pincode = pincode;
		this.area = area;
		this.city = city;
		this.village = village;
	}
	
	public address_embeddable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}

	@Override
	public String toString() {
		return "address_embeddable [pincode=" + pincode + ", area=" + area + ", city=" + city + ", village=" + village
				+ "]";
	}
	
}
