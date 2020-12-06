package hr.unipu.java;

import java.util.Scanner;

public class Main {
    private static final String YES = "D";
    private static int correctAnswerCount=0;

    public static void main(String[]args)
    {
        Quiz quiz = new Quiz ();
        quiz.setMaxsize(10);
        quiz.addQuestion("U kojem jeziku se programira za Android?", "Java");
        quiz.addQuestion("U kojem jeziku se programira za iOS?", "Objective C");

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Trenutno se u kvizu nalazi" + quiz.getNoOfQuestion() + " od " + quiz.getMaxSize() + " pitanja. Želite li unos novog pitanja? Da/Ne");
        input = scanner.nextLine();

        while (input.equalsIgnoreCase(YES) && quiz.isQuestionsUnderMaximum())
        {
            insertQuestionsToQuiz (quiz, scanner);
            input = getInput(quiz, scanner, input);
        }

        startQuiz (quiz, scanner);

        quiz.getResult(correctAnswerCount);

        input = "Da";
        while (input.equalsIgnoreCase(YES))
        {
            System.out.println("Želite li pokušati opet dodati pitanje? Da/Ne");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase(YES))
            {
                startQuiz(quiz, scanner);
                quiz.getResults(correctAnswerCount);
            }
        }
    }

    private  static String getInput (Quiz quiz, Scanner scanner, String input)
    {
        if (quiz.isQuestionUnderMaximum())
        {
            System.out.println("Možete unijeti još samo " + (quiz.getMaxSize()-quiz.getNoOfQuestions()) + "! Unos novog pitanja: Da/Ne");
            input = scanner.nextLine();
        }
        else
        {
            System.out.println("Unijeli ste maksimalan broj pitanja.");
            System.out.println();
        }
        return input;
    }

    private static void insertQuestionsToQuiz(Quiz quiz, Scanner scanner)
    {
        String question;
        String answer;
        System.out.println("Unesite novo pitanje: ");
        question=scanner.nextLine();
        System.out.println("Unesite odgovor na unešeno pitanje: ");
        answer=scanner.nextLine();

        quiz.addQuestion(question,answer);
    }

    private static void startQuiz(Quiz quiz, Scanner scanner)
    {
        quiz.getQuestionsAndAnswers().forEach(questionObject,answerObject);
        {
            System.out.println(questionObject.getQuestion());

            String answerText=scanner.next();

            if (quiz.isCorrectAnswer(questionObject,answerText))
            {
                correctAnswerCount++;
                System.out.println("Točno.");
            }
            else
            {
                System.out.println("Netočno.");
            }
        }
    }

}
