package Property;


import java.util.Date;


public class RentalProperty extends Property {

	
	private double weeklyRental;  // $300
	private Date contractStart;   // 1st Jan 2020
	private int contractDuration;  // 6 months, 12 months 
	private String rentalStatus; // for lease, under contract, leasing
	
	
	
	public RentalProperty(int propID, int empENum, int cusID, String address, String subsurb, String postcode,
			int numBedroom, int numbathroom, int numCarspace, double landsize, String propType, double weeklyRental, 
			Date contractStart, int contractDuration, String rentalStatus) {
		
		super(propID, empENum, cusID, address, subsurb, postcode, numBedroom, numbathroom, numCarspace, landsize, propType);

		this.weeklyRental =  weeklyRental;
		this.contractStart = contractStart;
		this.contractDuration = contractDuration;
		this.rentalStatus = rentalStatus;

		
		
	}



	public double getWeeklyRental() {
		return weeklyRental;
	}



	public void setWeeklyRental(double weeklyRental) {
		this.weeklyRental = weeklyRental;
	}



	public Date getContractStart() {
		return contractStart;
	}



	public void setContractStart(Date contractStart) {
		this.contractStart = contractStart;
	}



	public int getContractDuration() {
		return contractDuration;
	}



	public void setContractDuration(int contractDuration) {
		this.contractDuration = contractDuration;
	}



	public String getRentalStatus() {
		return rentalStatus;
	}



	public void setRentalStatus(String rentalStatus) {
		this.rentalStatus = rentalStatus;
	}



	@Override
	public String toString() {
		return  super.toString() + "eeklyRental=" + weeklyRental + ", contractStart=" + contractStart
				+ ", contractDuration=" + contractDuration + ", rentalStatus=" + rentalStatus;
	}
	
	
	
	
	
	
	
	
}
