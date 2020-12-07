package hr.unipu.java;

import sun.util.BuddhistCalendar;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Main {

    public static String Datoteka1;
    public static String Datoteka2;

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fileName = "src" + File.separator + "hr" + File.separator + "unipu" + File.separator + "java" + File.separator + "imena" + File.separator;

        System.out.println("Unesite ime prve datoteke: ");
        Datoteka1 = fileName + scanner.nextLine();

        System.out.println("Unesite ime druge datoteke: ");
        Datoteka2 = fileName + scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("Datoteka.txt");

            FileReader reader1 = new FileReader(new File(Datoteka1));
            BufferedReader bufreader1 = new BufferedReader(reader1);

            FileReader reader2 = new FileReader (new File(Datoteka2));
            BufferedReader bufreader2 = new BufferedReader(reader2);

            String line1 = "";
            String line2 = "";

            //TreeSet zbog sortiranja različitih rezultata
            Set<String> set1 = new TreeSet<>();
            Set<String> set2 = new TreeSet<>();

            while ((line1 = bufreader1.readLine()) != null && (line2 = bufreader2.readLine()) != null) {
                set1.add(line1);
                set2.add(line2);
            }

            //Brisanje elemenata iz skupa Set1 koje sadrži skup Set2
            set1.removeAll(set2);

            System.out.println("Imena koja su pohranjena u 1., ali ne i u 2. datoteci: ");

            for (String imena : set1) {

                System.out.println(imena);
                writer.write(imena + " "); //Rezultati koji se upisuju u .txt file
            }

            bufreader1.close();
            bufreader2.close();
            reader1.close();
            reader2.close();
            writer.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("Upisana datoteka ne postoji!");
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}