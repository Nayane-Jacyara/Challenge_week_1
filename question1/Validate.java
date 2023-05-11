package question1;
import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees to register: ");
        int numEmployees = scanner.nextInt();

        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter the employee name " + (i + 1) + " : ");
            String name = scanner.next();
 
            System.out.print("Enter the employee salary " + (i + 1)+ " : ");
            double salary = scanner.nextDouble();

            employees[i] = new Employee(name,salary,i);
        }
        
        scanner.close();
        
        for (int i = 0; i < numEmployees; i++) {
            Employee employee = employees[i];
            System.out.println( "Employee: " + employee.getName() + " \nSalary: R$" + employee.getSalary());
            employee.calculate();
        }
        
    }                
}
