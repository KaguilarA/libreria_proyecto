package LS;

/**
 *
 * @author Kevin Aguilar && Eduardo Cruz
 */
public class Complaiment extends User{
    
    protected String address;

    public Complaiment() {
        super();
    }

    public Complaiment(String paddress, String pname, String psecondname, String psurname, String psecondsurname, String pemail, String ppassword, String pidentification, int pphone, int prole) {
        super(pname, psecondname, psurname, psecondsurname, pemail, ppassword, pidentification, pphone, prole);
        this.address = paddress;
    }

    // Gets
    public String getAddress() {
        return address;
    }
    
    // Sets
    public void setAddress(String address) {
        this.address = address;
    }

    // To String
    @Override
    public String toString() {
        return super.toString() + ", Dirección = " + address;
    }
}
