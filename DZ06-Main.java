package hr.unipu.java;

import java.util.Scanner;

public class Main {

    private static MaxNumberOfQuestions max;

    public static void main (String[] args) {
        Quiz quiz = new Quiz();
        
        ShortAnswerQuestion question = new ShortAnswerQuestion("U kojem jeziku se programira za Android?", "Java");
        quiz.addQuestion(question);
        Scanner scanner = new Scanner(System.in);
        
        String izbor;
        String pitanje;
        String odgovor;
        
        System.out.println("Ako želite unijeti novo pitanje pritisnite tipku 1.");
        System.out.println("Ako ne želite unijeti novo pitanje pritisnite tipku 2.");
        izbor = scanner.nextLine();
        
        while (izbor.equalsIgnoreCase("1")) try {
            System.out.println("Upišite pitanje: ");
            pitanje = scanner.nextLine();
            System.out.println("Unesite odgovor na pitanje koje ste upisali: ");
            odgovor = scanner.nextLine();
            
            ShortAnswerQuestion NovoPitanje = new ShortAnswerQuestion(pitanje, odgovor);
            quiz.addQuestion(NovoPitanje);
            
            if (quiz.getNoOfQuestions() < 5) {
                System.out.println("Želite li unijeti još pitanja?");
                System.out.println("Ako ne želite unijeti još pitanja pritisnite broj 2.");
                izbor = scanner.nextLine();
            }
            else {
                throw new MaxNumberOfQuestions("Došli ste do maksimalnog broja pitanja.");
            }
            
            if (izbor.equalsIgnoreCase("2")) {
                int tocno = 0;
                
                for (int i = 0; i < quiz.getNoOfQuestions(); i++) {
                    System.out.println(quiz.getQuestion(i));
                    String NoviOdgovor = scanner.nextLine();
                    if (quiz.isCorrectAnswer(i, NoviOdgovor)) {
                        tocno++;
                        System.out.println("Točno.");
                    }
                    else {
                        System.out.println("Netočno.");
                    }
                }
                
                double brojPitanja = quiz.getNoOfQuestions();
                double rezultat = tocno / brojPitanja * 100;
                
                System.out.println("Odgovorili ste točno na %.2f", rezultat);
                System.out.println("% ("+tocno + "/" + quiz.getNoOfQuestions() + ") pitanja");
            }
        }

        catch (MaxNumberOfQuestions) {
            System.out.println(max.getMessage());
            izbor = " 2";
        }
        
        System.out.println("Ispit je spreman.");
    }
}

// Domaca zadaca 06
// Marijela Milicevic
// FIPU - nastavni smjer