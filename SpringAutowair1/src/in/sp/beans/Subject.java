package in.sp.beans;

public class Subject {
	private String subname;
	private int subNo;
	
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public int getSubNo() {
		return subNo;
	}
	public void setSubNo(int subNo) {
		this.subNo = subNo;
	}
	@Override
	public String toString() {
		return "[subname=" + subname + ", subNo=" + subNo + "]";
	}
	

}
