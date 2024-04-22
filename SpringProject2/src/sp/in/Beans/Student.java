package sp.in.Beans;

public class Student {
	private String name;
	private int roll;
	private String address;
	private String subject;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void display() {
		System.out.println("NAME :"+name);
		System.out.println("ROLL :"+roll);
		System.out.println("ADDRESS :"+address);
		System.out.println("SUBJECT :"+subject);
	}
	

}
