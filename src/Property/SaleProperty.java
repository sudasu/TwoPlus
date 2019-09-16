package Property;



public class SaleProperty extends Property{

	private double minPrice;
	private String saleStatus; // for sale, under offer, under contract, sold
	
	
	public SaleProperty(int propID, int empENum, int cusID, String address, String subsurb, String postcode,
			int numBedroom, int numbathroom, int numCarspace, double landsize, String propType, double minPrice, String saleStatus) {
		
		super(propID, empENum, cusID, address, subsurb, postcode, numBedroom, numbathroom, numCarspace, landsize, propType);
  
		this.minPrice = minPrice;
		this.saleStatus = saleStatus;
	
		
	}


	public double getMinPrice() {
		return minPrice;
	}


	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}


	public String getSaleStatus() {
		return saleStatus;
	}


	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}


	@Override
	public String toString() {
		return  super.toString() + "min Price=" + minPrice + ", sale Status=" + saleStatus;

	}
	
	
	
	
	
	
	
}
