package entity;

public class Address 
{
	private String houseno;
	private String streetname;
	private int pincode;
	public Address(String houseno, String streetname, int pincode) {
		super();
		this.houseno = houseno;
		this.streetname = streetname;
		this.pincode = pincode;
	}
	
	public String getHouseno() {
		return houseno;
	}
	
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	
	public String getStreetname() {
		return streetname;
	}
	
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	
	public int getPincode() {
		return pincode;
	}
	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

}
