package question3;

public class MultipleChoiceQuestion implements Question {
    private String question;
    private String correctAnswer;
    private String[] options;

    public MultipleChoiceQuestion(String question, String correctAnswer, String [] options) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean isCorrectAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }

    public String[] getOptions() {
        return options;
    }
}
