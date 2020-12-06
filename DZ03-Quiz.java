package hr.unipu.java;

import java.util.HashMap;

public class Quiz {
    private String name;
    private HashMap < Question; Answer > questionAndAnswers = new HashMap<>();
    private int maxSize=10;

    public Quiz () {
        this.name="Initial Quiz";
    }

    public Quiz (String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize=maxSize;
    }

    public HashMap<Question, Answer>getQuestionAndAnswers() {
        return QuestionAndAnswers;
    }

    public int getNoOfQuestion () {
        return questionAndAnswers.size();
    }

    public void addQuestion(String question, String answer) {
        if (questionAndAnswer.size() < maxSize)
        {
            questionAndAnswers.put(new Question()(question), new Answer(answer));
        }
        else
        {
            System.out.println("Unijeli ste maksimalni broj dopuštenih pitanja!");
        }
    }

    public boolean isQuestionUnderMaximum() {
        return questionAndAnswer.size() < maxSize;
    }

    public boolean isCorrectAnswer(Question key, String answer) {
        return questionsAndAnswers.get(key).isCorrectAnswer(answer);
    }

    public void getResults (int correctAnswerCount) {
        double numberofQuestions=getNoOfQuestion();
        double results = correctAnswerCount/numberofQuestions*100;

        System.out.println();
        System.out.println("Ukupno %.2f", results);
        System.out.println("% točnih odgovora" + correctAnswerCount + " od " + getNoOfQuestion() + " pitanja ");
    }
}
