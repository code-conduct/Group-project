package in.sp.beans;

public class Employee {
	private int empid;
	private String empname;
	private String empstatus;
	 
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpstatus() {
		return empstatus;
	}
	public void setEmpstatus(String empstatus) {
		this.empstatus = empstatus;
	}
	
	public void display() {
		
		
		System.out.println("EmployeeId :"+empid);
		System.out.println("Employeename :"+empname);
		System.out.println("Employeestatus :"+empstatus);
	}
	

}
