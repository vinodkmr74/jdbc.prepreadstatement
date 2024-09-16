package jdbc.prepreadstatement.Entity;

public class Employee {
	
	private int id;
	private String name;
	private String address;
	private String department;
	private int saraly;
	
	
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String address, String department, int saraly) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.department = department;
		this.saraly = saraly;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSaraly() {
		return saraly;
	}
	public void setSaraly(int saraly) {
		this.saraly = saraly;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", department=" + department
				+ ", saraly=" + saraly + ", getId()=" + getId() + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getDepartment()=" + getDepartment() + ", getSaraly()=" + getSaraly()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
		
	

}
