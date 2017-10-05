package LS;

/**
 *
 * @author Kevin Aguilar && Eduardo Cruz
 */
public class User {
    
    protected String name, secondName, surname, secondSurname, email, password, identification;
    protected int phone, role;

    public User() {
    }

    public User(String pname, String psecondname, String psurname, String psecondsurname, String pemail, String ppassword, String pidentification, int pphone, int prole) {
        this.name = pname;
        this.secondName = psecondname;
        this.surname = psurname;
        this.secondSurname = psecondsurname;
        this.email = pemail;
        this.password = ppassword;
        this.identification = pidentification;
        this.phone = pphone;
        this.role = prole;
    }

    // Gets
    public String getName() {
        return name;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getSurname() {
        return surname;
    }
    public String getSecondSurname() {
        return secondSurname;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getIdentification() {
        return identification;
    }
    public int getPhone() {
        return phone;
    }
    public int getRole() {
        return role;
    }

    // Sets
    public void setName(String name) {
        this.name = name;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setIdentification(String identification) {
        this.identification = identification;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public void setRole(int role) {
        this.role = role;
    }

    // To String
    @Override
    public String toString() {
        return "Nombre = " + name + ", Segundo Nombre = " + secondName + ", Primer apellido = " + surname + ", Segundo apellido = " + secondSurname + ", Correo electrónico=" + email + ", Número de cédula=" + identification + ", Télefono=" + phone + ", Rol = " + role;
    }
    
}
