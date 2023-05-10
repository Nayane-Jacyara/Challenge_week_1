package question1;
import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de funcionários a cadastrar: ");
        int numEmployees = scanner.nextInt();

        Employee[] employees = new  Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
            String name = scanner.next();

            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            double salary = scanner.nextDouble();

            employees[i] = new  Employee(name, salary);
        }

        System.out.println("\nFuncionários cadastrados:");

        for (int i = 0; i <numEmployees; i++) {
            Employee Employee  = employees[i];
            System.out.println(Employee.getName() + " - R$" + Employee.getSalary());
        }
    }
}
