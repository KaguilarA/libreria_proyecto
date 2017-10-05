package LS;

/**
 *
 * @author Kevin Aguilar && Eduardo Cruz
 */

import java.util.Date;

public class Case {
    
    protected String idJugde, idComplaiment, idSecretary, idCase, description;
    protected int state;
    protected Date registerDate;

    public Case() {
    }

    public Case(String pidjugde, String pidcomplaiment, String pidsecretary, String pidcase, String pdescription, int pstate, Date pregisterdate) {
        this.idJugde = pidjugde;
        this.idComplaiment = pidcomplaiment;
        this.idSecretary = pidsecretary;
        this.idCase = pidcase;
        this.description = pdescription;
        this.state = pstate;
        this.registerDate = pregisterdate;
    }

    // Gets
    public String getIdJugde() {
        return idJugde;
    }
    public String getIdComplaiment() {
        return idComplaiment;
    }
    public String getIdSecretary() {
        return idSecretary;
    }
    public String getIdCase() {
        return idCase;
    }
    public String getDescription() {
        return description;
    }
    public int getState() {
        return state;
    }
    public Date getRegisterDate() {
        return registerDate;
    }

    // Sets
    public void setIdJugde(String idJugde) {
        this.idJugde = idJugde;
    }
    public void setIdComplaiment(String idComplaiment) {
        this.idComplaiment = idComplaiment;
    }
    public void setIdSecretary(String idSecretary) {
        this.idSecretary = idSecretary;
    }
    public void setIdCase(String idCase) {
        this.idCase = idCase;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setState(int state) {
        this.state = state;
    }
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    // To String
    @Override
    public String toString() {
        return "idJugde=" + idJugde + ", idComplaiment=" + idComplaiment + ", idSecretary=" + idSecretary + ", Identificación del caso = " + idCase + ", Descripción = " + description + ", Estado = " + state + ", Fecha de registro=" + registerDate;
    }

}
