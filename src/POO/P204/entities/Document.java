package POO.P204.entities;

public class Document {
    private String dni;
    private char nif;

    public Document() {}

    public Document(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getNif() {
        return nif;
    }

    public void setNif(char nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "DOCUMENTO DE IDENTIDAD:" +
                "\nDNI: " + dni + "-" + nif;
    }
}
