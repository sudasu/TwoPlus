package Customer;
public class Tenant extends Customer {

    private double income;
    private String occupation;
    private String currEmployer;
    private String currRentalAgency;
    
    private String savedSuburb;
    
    
    
    public Tenant(int cusID, String password, String name, String phone, String email, String type, 
            double income, String occupation, String currEmployer, String currRentalAgency, String savedSuburb) {
        super(cusID, password, name, phone, email, type);
        
        
        this.income = income;
        this.occupation = occupation;
        this.currEmployer = currEmployer;
        this.currRentalAgency = currRentalAgency;
        this.savedSuburb = savedSuburb;

    
    }



    public double getIncome() {
        return income;
    }



    public void setIncome(double income) {
        this.income = income;
    }



    public String getOccupation() {
        return occupation;
    }



    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }



    public String getCurrEmployer() {
        return currEmployer;
    }



    public void setCurrEmployer(String currEmployer) {
        this.currEmployer = currEmployer;
    }



    public String getCurrRentalAgency() {
        return currRentalAgency;
    }



    public void setCurrRentalAgency(String currRentalAgency) {
        this.currRentalAgency = currRentalAgency;
    }



    public String getSavedSuburb() {
        return savedSuburb;
    }



    public void setSavedSuburb(String savedSuburb) {
        this.savedSuburb = savedSuburb;
    }

    
    

    @Override
    public String toString() {
        return  super.toString() + ", income=" + income + ", occupation="+ occupation+ ", currEmployer=" + currEmployer+ 
                ", currRentalAgency="+ currRentalAgency+ ", savedSuburb=" + savedSuburb; 
    }
    
    
    
    

}