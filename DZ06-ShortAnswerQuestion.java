package hr.unipu.java;

public class ShortAnswerQuestion {

    private String text;
    private String correctAnswer;

    public ShortAnswerQuestio (String text, String correctAnswer) {

        this.text = text;
        this.correctAnswer = correctAnswer;
    }

    public String getText() {
        return text;
    }

    public boolean isCorrectAnswer (String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}