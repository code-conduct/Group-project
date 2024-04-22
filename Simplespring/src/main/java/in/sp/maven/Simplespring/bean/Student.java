package in.sp.maven.Simplespring.bean;

public class Student {
	private String name;
	private String address;
	private int Roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	
	public void Display() {
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		System.out.println("Roll :"+Roll);
	}

}
