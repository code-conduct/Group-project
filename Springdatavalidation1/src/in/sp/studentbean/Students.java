package in.sp.studentbean;

public class Students {
	private String name;
	private int roll;
	private String  phone;
	
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
	public String  getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
public void display() {
	System.out.println("NAME :" +name );
	System.out.println("Roll :" +roll );
	System.out.println("Phone :" +phone );
	
}
	

}
