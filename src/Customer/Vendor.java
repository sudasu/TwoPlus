package Customer;
public class Vendor extends Customer{

    private String section32;
    

    public Vendor(int cusID, String password, String name, String phone, String email, String type, String section32) {
        super(cusID, password, name, phone, email, type);
        
        this.section32 = section32;
        
    }


    public String getSection32() {
        return section32;
    }


    public void setSection32(String section32) {
        this.section32 = section32;
    }




    @Override
    public String toString() {
        return  super.toString() + "section32=" + section32; 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}