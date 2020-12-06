package unipu.hr.java;

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main (String[]args) {
        ArrayList<Student> studenti = new ArrayList<Student>();

        while (true)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Za unos podataka o studentu pritisnite tipku 1. Za izlazak iz programa pritisnite 2.");
            int odabir = sc.nextInt();

            if (odabir==1)
            {
                Student student = new Student ();
                student.init();

                System.out.println("Unesite ID ili JMBAG studenta:");
                student.setId(sc.nextLine());

                System.out.println("Unesite studentovo ime:");
                student.setName(sc.nextLine());

                System.out.println("Unesite studentovo prezime:");
                student.setSurname(sc.nextLine());

                System.out.println("Unesite kod za predavanje:");
                int Id = sc.nextLine();

                System.out.println("Unesite naziv predavanja:");
                String naziv = sc.nextLine();

                System.out.println("Unesite studentovu ocjenu:");
                int ocjena = sc.nextLine();

                student.addGrade (Id, naziv, ocjena);
                studenti.add(student);

                continue;
            }

            else
            {
                for (Student student:studenti)
                { System.out.println(student.toString()); }

                System.out.println();
                System.out.println("Izlazak iz programa.");
                break;
            }
        }
    }
}

