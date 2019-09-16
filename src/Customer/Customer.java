package Customer;



public class Customer {

	
	
	private int cusID;
	private String password;
	private String name;
	private String phone;
	private String email;
	private String type;
	
	
	public Customer(int cusID, String password, String name, String phone, String email, String type ) {
		
		this.cusID = cusID;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.type = type;		
		
	}


	public int getCusID() {
		return cusID;
	}


	public void setCusID(int cusID) {
		this.cusID = cusID;
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


	public String toString() {
		return "Customer ID=" + cusID + ", name=" + name + ", phone=" + phone + ", email="
				+ email + ", type=" + type;
	}
	
	
	
	
	
	
	
}
