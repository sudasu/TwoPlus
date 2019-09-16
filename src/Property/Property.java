package Property;



public class Property {

	
	private int propID;
	private int empENum;
	private int cusID;
	private String address;
	private String subsurb;
	private String postcode;
	private int numBedroom;
	private int numbathroom;
	private int numCarspace;
	private double landsize;
	private String propType;   // house, townhouse, unit, apartment, studio, land
	
	
	
	public Property(int propID, int empENum, int cusID, String address, String subsurb, String postcode, int numBedroom, int numbathroom,
			int numCarspace, double landsize, String propType) {

		
		
		this.propID = propID;
		this.empENum = empENum;
		this.cusID = cusID;
		this.address = address;
		this.subsurb = subsurb;
		this.postcode = postcode;
		this.numBedroom = numBedroom;
		this.numbathroom = numbathroom;
		this.numCarspace = numCarspace;
		this.landsize = landsize;
		this.propType = propType;
		
		
	}



	public int getPropID() {
		return propID;
	}



	public void setPropID(int propID) {
		this.propID = propID;
	}



	public int getEmpENum() {
		return empENum;
	}



	public void setEmpENum(int empENum) {
		this.empENum = empENum;
	}



	public int getCusID() {
		return cusID;
	}



	public void setCusID(int cusID) {
		this.cusID = cusID;
	}

	

	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getSubsurb() {
		return subsurb;
	}



	public void setSubsurb(String subsurb) {
		this.subsurb = subsurb;
	}



	public String getPostcode() {
		return postcode;
	}



	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}



	public int getNumBedroom() {
		return numBedroom;
	}



	public void setNumBedroom(int numBedroom) {
		this.numBedroom = numBedroom;
	}



	public int getNumbathroom() {
		return numbathroom;
	}



	public void setNumbathroom(int numbathroom) {
		this.numbathroom = numbathroom;
	}



	public int getNumCarspace() {
		return numCarspace;
	}



	public void setNumCarspace(int numCarspace) {
		this.numCarspace = numCarspace;
	}



	public double getLandsize() {
		return landsize;
	}



	public void setLandsize(double landsize) {
		this.landsize = landsize;
	}



	public String getPropType() {
		return propType;
	}



	public void setPropType(String propType) {
		this.propType = propType;
	}



	public String toString() {
		return "Property ID=" + propID + ", Employee E-Num=" + empENum + ", Customer ID=" + cusID +", address=" + address + ", subsurb=" + subsurb + 
				", postcode=" + postcode + ", Bedroom=" + numBedroom + ", bathroom=" + numbathroom + ", Carspace=" + numCarspace
				+ ", landsize=" + landsize + ", Property Type=" + propType;
	}



	
	
	
}
