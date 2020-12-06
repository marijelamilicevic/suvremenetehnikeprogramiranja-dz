package hr.unipu.java;

public class MaxNumberOfQuestions extends RuntimeException {
    private String message;
    MaxNumberOfQuestions (String message) {
        super(message);
        this.message=message;
    }
    @Override

    public String getMessage() {
        return message;
    }
}