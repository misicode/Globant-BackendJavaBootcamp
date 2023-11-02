package org.amincia._04Relationships.P203.entities;

public class Customer {
    private String name;
    private String lastname;
    private String idDoc;
    private String email;
    private String address;
    private String phonenumber;

    public Customer() {}

    public Customer(String name, String lastname, String idDoc, String email, String address, String phonenumber) {
        this.name = name;
        this.lastname = lastname;
        this.idDoc = idDoc;
        this.email = email;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setIdDoc(String idDoc) {
        this.idDoc = idDoc;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "CLIENTE:" +
                "\nNombres: " + name + " " + lastname +
                "\nDocumento: " + idDoc +
                "\nCorreo: " + email +
                "\nDirección: " + address +
                "\nTeléfono: " + phonenumber;
    }
}
