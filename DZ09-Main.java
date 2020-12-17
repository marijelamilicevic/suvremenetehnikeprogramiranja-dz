package hr.unipu.java;

import  java.io.*;

public class Main {
    public static void main (String[] args) {

        String Argument1 = args[0];
        String Argument2 = args[1];

        boolean Argument3 = args.length > 2  (args[2].equals("-p")) || args[2].equals("-print");

        try (FileReader fin = new FileReader(Argument1);
        BufferedReader in = new BufferedReader(fin);
        FileWriter writer = new FileWriter(Argument2)) {

        String line;

            while ((line = in.readLine() ) != null) {
                if (Argument3)
                    System.out.println(line);
                writer.write(line + " ");
            }

            System.out.println(" Datoteka je uspješno prepisana!");
        }

        catch ( (FileNotFoundException e) {
            System.out.println(" Datoteka ne postoji!");
        }
        catch (IOException e) {
        }
    }
}