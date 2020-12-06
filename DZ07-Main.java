package hr.unipu.java;

import java.util.Scanner;

/** @author Marijela Miličević
 * @version 2.0
 * Datum: 30.11.2020.
 * Suvremene tehnike programiranja - DZ07
 */

public class Main {

    public static void main (String[] args) {
        double broj1;
        double broj2;
        int operacijazadatka;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Unesite prvi broj: ");
        broj1 = scanner.nextDouble();
        System.out.println(" Unesite drugi broj: ");
        broj2 = scanner.nextDouble();

        int Izbor = 0;
        while (Izbor==0) {

            System.out.println(" Odaberite opciju: \n 1. Zbrajanje (+) \n 2. Oduzimanje (-) \n 3. Množenje (*) \n 4. Dijeljenje (/)");
            operacijazadatka=scanner.nextInt();

            if (operacijazadatka != 1 && operacijazadatka !=2 && operacijazadatka != 3 && operacijazadatka != 4) {
                System.out.println("Molim odaberite jednu od ponuđenih mogućnosti: ");
                Izbor=0;
            }
            else {
                Izbor=1;
            }

            //lambda izrazi
            Tip zbrajanje = (double x, double y) -> x+y;
            Tip oduzimanje = (double x, double y) -> x-y;
            Tip mnozenje = (double x, double y) -> x*y;
            Tip dijeljenje = (double x, double y) -> x/y;

            switch (operacijazadatka) {
                case 1: System.out.println("Rezultat zadatka je: " + zbrajanje.izracun(broj1,broj2));
                break;
                case 2: System.out.println("Rezultat zadatka je: " + oduzimanje.izracun(broj1,broj2));
                break;
                case 3: System.out.println("Rezultat zadatka je: " + mnozenje.izracun(broj1,broj2));
                break;
                case 4: if (broj2!=0) {
                    System.out.println(dijeljenje.izracun(broj1, broj2));
                    break;
                }
            }
        }
    }
}

// Domaca zadaca 07B
// Marijela Milicevic
// FIPU - nastavni smjer