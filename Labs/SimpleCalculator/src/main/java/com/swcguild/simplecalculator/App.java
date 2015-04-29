package com.swcguild.simplecalculator;

import com.swcguild.consoleio.ConsoleIO;

/**
 *
 * @author terry
 */
public class App {

    public static void main(String[] args) {
        int input = 0;
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        ConsoleIO io = new ConsoleIO();
        Calculator calc = new Calculator();
        do {
            input = io.scanInt("Choose an operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            io.printString("");

            if (input == 5) {
                break;
            }

//            System.out.print("Enter the first operand: ");
            num1 = io.scanInt("Enter the first operand: ");
//            System.out.print("Enter the second operand: ");
            
            num2 = io.scanInt("Enter the second operand: ");

            switch (input) {
                case 1:
                    result = calc.add(num1, num2);
                    break;
                case 2:
                    result = calc.subtract(num1, num2);
                    break;
                case 3:
                    result = calc.multiply(num1, num2);
                    break;
                case 4:
                    result = calc.divide(num1, num2);
                    break;
                default:
                    break;
            }

//            System.out.print("Your result is: " + result);
            io.printString("Your result is: " + result);
            io.printString("");
        } while (input != 5);

    }
}
