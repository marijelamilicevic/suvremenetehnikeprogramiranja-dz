package hr.unipu.java;

public class Student extends Person {

    private int IDStudenta;

    String[] predmet = new String[20];
    String[] profesor = new String[20];

    public Student (String ime, String prezime, int IDStudenta, String predmet[], String profesor[]) {
        this.IDStudenta = IDStudenta;
        this.predmet = predmet;
        this.profesor = profesor;
    }
    public int getIDStudenta() {
        return IDStudenta;
    }

    public void setIDStudenta(int IDStudenta) {
        this.IDStudenta = IDStudenta;
    }

    public void displayDetails() {
        System.out.println("Student: \n" + "Ime: " + getIme()
                + "Prezime: " + getPrezime() + " \n" + "ID studenta: " + getIDStudenta());

        for (int i = 0; i < predmet.length && i < profesor.length; i++) {

            System.out.println("Predmet: " + predmet[i] +
                    " \n " + "Profesor: " + profesor[i]);
        }
    }
}
