package hr.unipu.java;

import java.util.Scanner;
// import the Scanner class
import java.util.ArrayList;
// import the ArrayList class

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        //stringovi koje korisnik unosi
        String inputString;
        int samoglasnici1 = 0;
        int suglasnici1 = 0;
        int samoglasnici2 = 0;
        int suglasnici2 = 0;

        ArrayList<String> inputStringArray = new ArrayList<>();
        ArrayList<String> rezultatniStringovi = new ArrayList<>();

        do {
            // Ovo je poruka korisniku da unese string
            System.out.println("Unesi string: ");

            inputString = myObj.nextLine();
            inputString = inputString.toLowerCase();

            inputStringArray.add(inputString);

        } while (!inputString.equals("kraj"));

        for (int i = 0; i < inputStringArray.size(); i++) {
            for(int j = i + 1; j < inputStringArray.size(); j++) {
                for(int z = 0; z < inputStringArray.get(j).length(); z++) {
                    char ch = inputStringArray.get(j).charAt(z);
                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        ++samoglasnici1;
                    }
                    else if((ch >= 'a'&& ch <= 'z')) {
                        ++suglasnici1;
                    }

                }

                for(int k = 0; k < inputStringArray.get(i).length(); k++) {
                    char ch = inputStringArray.get(i).charAt(k);

                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        ++samoglasnici2;
                    }
                    else if((ch >= 'a'&& ch <= 'z')) {
                        ++suglasnici2;
                    }
                }
                if((samoglasnici1 == samoglasnici2) && (suglasnici2 == suglasnici1)) {
                    if (!rezultatniStringovi.contains(inputStringArray.get(i))) {
                        rezultatniStringovi.add(inputStringArray.get(i));
                    }
                    if(!rezultatniStringovi.contains(inputStringArray.get(j))) {
                        rezultatniStringovi.add(inputStringArray.get(j));
                    }
                }

                samoglasnici1 = 0;
                suglasnici1 = 0;
                samoglasnici2 = 0;
                suglasnici2 = 0;
            }
        }

        System.out.println("Stringovi s jednakim brojem samoglasnika i suglasnika: " + rezultatniStringovi);
    }
}

// Domaca zadaca 2A
// Marijela Milicevic
// FIPU - nastavni smjer
