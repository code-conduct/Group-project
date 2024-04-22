package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Students {
	private String name;
	private int roll;
	private String address;
	@Autowired
	@Qualifier("sub2")
	private Subject subject;

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("NAME :"+name);
		System.out.println("ROLL :"+roll);
		System.out.println("ADDRESS :"+address);
		System.out.println("subject :"+subject);
	}
	

}
