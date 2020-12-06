package hr.unipu.java;

public class Quiz {

    private String name;
    private ShortAnswerQuestion[] questions = new ShortAnswerQuestion[5];
    private int noOfQuestions = 0;

    public Quiz() {
        name = "Initial Quiz";
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public ShortAnswerQuestion[] getQuestions() {
        return questions;
    }
    public int getNoOfQuestions() {
        return noOfQuestions;
    }
    public void addQuestion (String text, String answer) {
        if (noOfQuestions<5) {
            questions[noOfQuestions] = new ShortAnswerQuestion()(text, answer);
        }
        else {
            System.out.println("Postavili ste maksimalan broj pitanja!");
        }
        noOfQuestions++;
    }
    public void addQuestion (ShortAnswerQuestion question) {
        if (noOfQuestions<5) {
            question[noOfQuestions] = question;
            noOfQuestions++
        }
        else {
            System.out.println("Postavili ste maksimalan broj pitanja!");
        }
    }

    public String getQuestion(int index) {
        return questions[index].getText();
    }

    public boolean isCorrectAnswer (int questionIndex, String answer) {
        return questions[questionIndex].isCorrectAnswer(answer);
    }
}