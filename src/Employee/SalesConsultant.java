package Employee;



	public class SalesConsultant extends Employee {

		private int assignedPropertyID;
		private int assignedPropertyAmt;
		
		
		
		public SalesConsultant(int empENum, String password, String name, String phone, String email, String type,
				String role, double partTimeHours, int assignedPropertyID, int assignedPropertyAmt) {
			super(empENum, password, name, phone, email, type, role, partTimeHours);

		this.assignedPropertyID = assignedPropertyID;
		this.assignedPropertyAmt =assignedPropertyAmt;
		
		
		}



		public int getAssignedPropertyID() {
			return assignedPropertyID;
		}



		public void setAssignedPropertyID(int assignedPropertyID) {
			this.assignedPropertyID = assignedPropertyID;
		}



		public int getAssignedPropertyAmt() {
			return assignedPropertyAmt;
		}



		public void setAssignedPropertyAmt(int assignedPropertyAmt) {
			this.assignedPropertyAmt = assignedPropertyAmt;
		}



		@Override
		public String toString() {
			return  super.toString() + ", assignedPropertyID=" + assignedPropertyID + ", assignedPropertyAmt="
					+ assignedPropertyAmt;
		}  
		
		
		
		
		
		
	}
