package p0212;

public class Member {
	private String name;
	private int grade;
	private String address;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public String toString() {
		return "[name= " + name + ", grade= " + grade + ", address= " + address + "]";
	}

}
