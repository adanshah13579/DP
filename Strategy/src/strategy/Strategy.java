/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package strategy;

import java.util.Scanner;

// Define a family of arithmetic operations (strategies)
interface OperationStrategy {
    double perform(double num1, double num2);
}

// Concrete implementations of arithmetic operations
class AdditionOperation implements OperationStrategy {
    @Override
    public double perform(double num1, double num2) {
        return num1 + num2;
    }
}

class SubtractionOperation implements OperationStrategy {
    @Override
    public double perform(double num1, double num2) {
        return num1 - num2;
    }
}

class MultiplicationOperation implements OperationStrategy {
    @Override
    public double perform(double num1, double num2) {
        return num1 * num2;
    }
}

class DivisionOperation implements OperationStrategy {
    @Override
    public double perform(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return Double.NaN; // Division by zero
        }
    }
}

// Calculator class that encapsulates the operations
class Calculator {
    private OperationStrategy strategy;

    public Calculator(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double num1, double num2) {
        return strategy.perform(num1, num2);
    }
}

public class Strategy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperationStrategy addition = new AdditionOperation();
        OperationStrategy subtraction = new SubtractionOperation();
        OperationStrategy multiplication = new MultiplicationOperation();
        OperationStrategy division = new DivisionOperation();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        Calculator calculator = new Calculator(addition);

        if (1 <= num1 && num1 <= 100 && 1 <= num2 && num2 <= 100) {
            System.out.println(num1 + " + " + num2 + " = " + calculator.calculate(num1, num2));
        } else if (100 <= num1 && num1 <= 1000 && 100 <= num2 && num2 <= 1000) {
            calculator.setStrategy(subtraction);
            System.out.println(num1 + " - " + num2 + " = " + calculator.calculate(num1, num2));
        } else if (1000 <= num1 && num1 <= 5000 && 1000 <= num2 && num2 <= 5000) {
            calculator.setStrategy(multiplication);
            System.out.println(num1 + " * " + num2 + " = " + calculator.calculate(num1, num2));
        } else if (10000 <= num1 && num1 <= 20000 && 10000 <= num2 && num2 <= 20000) {
            calculator.setStrategy(division);
            double result = calculator.calculate(num1, num2);
            if (Double.isNaN(result)) {
                System.out.println("Error: Division by zero");
            } else {
                System.out.println(num1 + " / " + num2 + " = " + result);
            }
        } else {
            System.out.println("Input numbers must be in the specified ranges for the corresponding operations.");
        }

        scanner.close();
    }
}
