package hr.unipu.java;

public class Pmdp<T> extends NekiBroj {
    private int operacijazadataka;
    private double rezultatzadatka = 0;

    void Pmdp(double broj1, double broj2, int operacijazadataka) {
        super ((Double) broj1, (Double) broj2); //odmotavanje
        this.operacijazadataka = operacijazadataka;
    }

    public double izracun() {

        if (operacijazadataka == 1) {
            rezultatzadatka = getBroj1() + getBroj2();
        } else if (operacijazadataka == 2) {
            rezultatzadatka = getBroj1() - getBroj2();
        } else if (operacijazadataka == 3) {
            rezultatzadatka = getBroj1() * getBroj2();
        } else if (operacijazadataka == 4) {
            rezultatzadatka = getBroj1() / getBroj2();
        } else {
            System.out.println(" Odaberite jednu od ponuđenih mogućnosti! ");
        }
        return rezultatzadatka;
    }
}

// Domaca zadaca 07A
// Marijela Milicevic
// FIPU - nastavni smjer