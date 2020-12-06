package hr.unipu.java;

public class Person {

    private String ime;
    private String prezime;

    public Person(String ime, String prezime) {}

    public String getIme() {
        return ime;
    }
    public String getPrezime() {
        return prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Person() {
        this.ime = ime;
        this.prezime = prezime;
    }

    public void displayDetails() {
        System.out.println("Podaci \n Ime: "
                + getIme() + " \n Prezime: " + getPrezime());
    }
}