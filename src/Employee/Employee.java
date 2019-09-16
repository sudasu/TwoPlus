package Employee;



public class Employee {

	
	private int empENum;
	private String password;
	private String name;
	private String phone;
	private String email;
	private String type;  // part-time or full-time
	private String role;  // branchManager or salesConsultant or propertyManager or branchAdmin
	private double partTimeHours;
	
	
	
	public Employee(int empENum, String password, String name, String phone, String email, String type, String role,
			double partTimeHours) {

		this.empENum = empENum;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.type = type;
		this.role = role;
		this.partTimeHours = partTimeHours;
		
		
	}


	public int getEmpENum() {
		return empENum;
	}


	public void setEmpENum(int empENum) {
		this.empENum = empENum;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public double getPartTimeHours() {
		return partTimeHours;
	}


	public void setPartTimeHours(double partTimeHours) {
		this.partTimeHours = partTimeHours;
	}


	@Override
	public String toString() {
		return "Employee E-Num=" + empENum + ", name=" + name + ", phone=" + phone + ", email="
				+ email + ", type=" + type + ", role=" + role + ", partTimeHours=" + partTimeHours;
	}
	
	
	
	
	
	
	
}
