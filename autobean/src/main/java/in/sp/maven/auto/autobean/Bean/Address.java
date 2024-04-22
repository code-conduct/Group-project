package in.sp.maven.auto.autobean.Bean;

public class Address {
	private String location;
	private String street;
	private int pin;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [location=" + location + ", street=" + street + ", pin=" + pin + ", getLocation()="
				+ getLocation() + ", getStreet()=" + getStreet() + ", getPin()=" + getPin() + ", ]";
	}
	

}
