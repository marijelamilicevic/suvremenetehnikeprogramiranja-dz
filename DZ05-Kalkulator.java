package hr.unipu.java;

import java.util.Scanner;

public class Kalkulator {

    public static void main (String[] args) {
        double broj1;
        double broj2;
        int operacijazadatka;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite 1. broj: ");
        broj1 = scanner.nextDouble();

        System.out.println("Unesite 2. broj: ");
        broj2 = scanner.nextDouble();

        int IzborOperacije = 0;
        while (IzborOperacije == 0) {

            System.out.println("Odaberite operaciju za izvršenje zadatka: \n 1.(Zbrajanje) + \n 2.(Oduzimanje) - \n 3.(Množenje) * \n 4.(Dijeljenje) / \n 5.Provjera jesu li upisani brojevi parni ili neparni. " );
            operacijazadatka = scanner.nextInt();

            if (operacijazadatka !=1 && operacijazadatka !=2 && operacijazadatka !=3 && operacijazadatka !=4 && operacijazadatka !=5) {
                System.out.println("Odaberite jednu od ponuđenih operacija.");

                IzborOperacije=0;
            }
            else {
                IzborOperacije = 1;
            }
            if (broj2 == 0 && operacijazadatka == 4) {
                System.out.println("Došlo je do pogreške. Dijeljenje s nulom nije moguće.");
            }

            Pmpd oz = new Pmpd(broj1,broj2,operacijazadatka);

            if (IzborOperacije != 0) {
                if (operacijazadatka != 5){
                    System.out.println("Dobiveni rezultat je: " + oz.izracun());
                }
                else {
                    oz.izracun();
                }
            }
        }
    }
}

// Domaca zadaca 05A
// Marijela Milicevic
// FIPU - nastavni smjer
