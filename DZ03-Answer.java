package hr.unipu.java;

public class Answer {

    private String answer;

    public  Answer(String answer) {
        this.answer=answer;
    }


    public java.lang.String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCorrectAnswer(String answer) {
        return this.answer.equalsIgnoreCase(answer);
    }
}
