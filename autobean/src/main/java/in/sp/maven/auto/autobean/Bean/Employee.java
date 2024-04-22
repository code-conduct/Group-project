package in.sp.maven.auto.autobean.Bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String Empname;
	private int Empid;
	@Autowired
	private Address address;
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void Display() {
		System.out.println("Empname :"+Empname);
		System.out.println("Empid :"+Empid);
		System.out.println("Address :"+address);
	}

}
