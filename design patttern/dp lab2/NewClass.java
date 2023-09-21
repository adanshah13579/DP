/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_lb_2;

/**
 *
 * @author fa20-bse-036
 */
// SOLID Principle: Single Responsibility Principle (SRP)
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

// SOLID Principle: Open/Closed Principle (OCP)
interface Printer {
    void print(String message);
}

class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}

public class NewClass {

    public static void main(String[] args) {
        // Principled code
        int x = 10;
        int y = 5;

        Calculator calculator = new Calculator();
        int result = calculator.add(x, y);

        Printer printer = new ConsolePrinter();
        printer.print("Result: " + result);
    }
}

