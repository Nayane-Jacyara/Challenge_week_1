package question3;

import java.util.Scanner;

public class Quiz {
    private static Question[] questions;
    private static Scanner scanner;

    public static void start() {
        scanner = new Scanner(System.in);

        questions = new Question[] {
            new SimpleQuestion("What is the capital of Brazil?", "Brasilia"),
            new MultipleChoiceQuestion("What is the capital of Pernambuco?", "Recife", new String[] {"Recife", "Sao Paulo", "Rio de Janeiro"}),
            new SimpleQuestion("What is the largest state in Brazil?", "Amazonas")
        };

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        int hits = 0;
        int errors = 0;

        for (Question question : questions) {
            System.out.print(question.getQuestion() + " ");

            if (question instanceof MultipleChoiceQuestion) {
                MultipleChoiceQuestion mcQuestion = (MultipleChoiceQuestion) question;
                displayOptions(mcQuestion.getOptions());
            }

            String answer = scanner.nextLine();

            if (question.isCorrectAnswer(answer)) {
                System.out.println("Right answer!");
                hits++;
            } else {
                System.out.println("Incorrect answer! The correct answer is: " + question.getCorrectAnswer());
                errors++;
            }
        }

        scanner.close();

        System.out.println("End of quiz!");
        System.out.println(name + "\nhits: " + hits + "\nerrors: " + errors);
    }

    private static void displayOptions(String[] options) {
        System.out.println("Options:");
        for (String option : options) {
            System.out.println("- " + option);
        }
    }
}
