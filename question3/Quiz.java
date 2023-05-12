package question3;

import java.util.Scanner;

public class Quiz{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        
        String[][] questionsAnswers = {
            {"What is the capital of Brazil?", "Brasilia"},
            {"What is the capital of Pernambuco?", "Recife"},
            {"What is the largest state in Brazil?", "Amazonas"}
        };
        
        int hits = 0;
        int erros = 0;
        
        for (int i = 0; i < questionsAnswers.length; i++) {
            
            System.out.print(questionsAnswers[i][0] + " ");
            String answers = scanner.nextLine();
            scanner.close();

            if (answers.equalsIgnoreCase(questionsAnswers[i][1])) {
                System.out.println("Right answer!");
                hits++;
            } else {
                System.out.println("Incorrect answer! The correct answer and: " + questionsAnswers[i][1]);
                erros++;
            }
        }
        
        System.out.println("End of quiz!");
        System.out.println(name + "\nhists: " + hits + "\nerrou: " + erros);
        
    }
}

