package Customer;
public class Buyer extends Customer {

    private String savedSuburb;

    
    public Buyer(int cusID, String password, String name, String phone, String email, String type, String savedSuburb) {
        super(cusID, password, name, phone, email, type);
        
        this.savedSuburb = savedSuburb;
        
    }


    public String getSavedSuburb() {
        return savedSuburb;
    }


    public void setSavedSuburb(String savedSuburb) {
        this.savedSuburb = savedSuburb;
    }


    @Override
    public String toString() {
        return  super.toString() + ", savedSuburb=" + savedSuburb; 
    }
    
    
}