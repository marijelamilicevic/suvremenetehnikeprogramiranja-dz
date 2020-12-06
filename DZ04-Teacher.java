package hr.unipu.java;

public class Teacher extends Person {

    private double placa;
    String[] predmet = new String[15];

    public Teacher (String ime, String prezime, double placa, String predmet[]) {
        this.placa = placa;
        this.predmet = predmet;
    }

    public double getPlaca() {
        return placa;
    }

    public void displayDetails() {
        System.out.println("Profesor: \n " + "Ime: " + getIme() + "\n" + "Prezime: "
                + getPrezime() + "\n" + "Placa: " + getPlaca() + " HRK \n" + "Predmeti: ");

        for (int i = 0; i < predmet.length && predmet[i]!=null; i++) {
            System.out.println(predmet[i]);
        }
    }
}