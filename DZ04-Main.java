package hr.unipu.java;

public class Main {

    public static void main(String[] args) {
        // Person
        Person netko = new Person();
        netko.displayDetails();
        System.out.println();

        Person Marijela = new Person("Marijela", "Miličević");
        Marijela.displayDetails();
        System.out.println();

        // Teacher
        String predmet1[] = new String[]
                {"Opća psihologija", "Razvojna psihologija"};
        Teacher MarlenaP = new Teacher("Marlena", "Plavšić",
                15500, predmet1);
        MarlenaP.displayDetails();
        System.out.println();

        String predmet2[] = new String[]
                {"Uvod u pedagogiju", "Pedagogija održivog razvoja"};
        Teacher NevenkaT = new Teacher("Nevenka", "Tatković",
                15500, predmet2);
        NevenkaT.displayDetails();
        System.out.println();

        /// Student
        String kolegijN[] = new String[]{
                "Opća psihologija", "Uvod u pedagogiju"};
        String nastavnikN[] = new String[]{
                "Marlena Plavsic", "Nevenka Tatkovic"};
        Student Nina = new Student("Nina", "Macuka",
                12345, kolegijN, nastavnikN);
        Nina.displayDetails();
        System.out.println();

        String kolegijM[] = new String[]{
                "Razvojna psihologija", "Pedagogija održivog razvoja"};
        String nastavnikM[] = new String[]{
                "Marlena Plavšić", "Nevenka Tatković"};
        Student Mea = new Student("Mea", "Miličević",
                54321, kolegijM, nastavnikM);
        Mea.displayDetails();
        System.out.println();
    }
}

/// Domaca zadaca 04A
/// Marijela Milicevic
/// FIPU - nastavni smjer