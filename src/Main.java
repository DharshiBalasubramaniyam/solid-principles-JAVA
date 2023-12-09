import Operation.InvalidOperation;
import Output.ConsoleOutput;
import Output.Output;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Output output = new ConsoleOutput();

        try {
            output.showMessage("\n1. Addition(+)\n2. Subtraction(-)\n3. Multiplication(*)\n4. Division(/)");
            output.showMessage("\n\nSelect your operation (1-4): ");
            int choice = scan.nextInt();

            output.showMessage("Enter first operand: ");
            double operand1 = scan.nextDouble();
            output.showMessage("Enter second operand: ");
            double operand2 = scan.nextDouble();

            CalculatorApp calculatorApp = new CalculatorApp(choice, operand1, operand2);
            System.out.println("\nThis result is " + calculatorApp.execute() + ".");
        }
        catch (InputMismatchException e) {
            output.showMessage("Invalid input type!\n");
        }
        catch (InvalidOperation | ArithmeticException e) {
            output.showMessage(e.getMessage());
        }

        scan.close();
    }
}