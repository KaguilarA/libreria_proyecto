package LS;

/**
 *
 * @author Kevin Aguilar && Eduardo Cruz
 */
public class Judge extends User{
    
    protected String hall;

    public Judge() {
        super();
    }

    public Judge(String phall, String pname, String psecondname, String psurname, String psecondsurname, String pemail, String ppassword, String pidentification, int pphone, int prole) {
        super(pname, psecondname, psurname, psecondsurname, pemail, ppassword, pidentification, pphone, prole);
        this.hall = phall;
    }
    
    // Gets
    public String getHall() {
        return hall;
    }

    // Sets
    public void setHall(String hall) {
        this.hall = hall;
    }

    // To String
    @Override
    public String toString() {
        return super.toString() + ", Sala = " + hall;
    } 
}
