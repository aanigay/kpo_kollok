package org.example;

import org.example.command.AddCommand;
import org.example.command.Calculator;
import org.example.command.Command;
import org.example.command.SubtractCommand;
import org.example.strategy.FirstPrinter;
import org.example.strategy.IPrinter;
import org.example.strategy.SecondPrinter;
import org.example.strategy.ThirdPrinter;

public class Main {
    public static void main(String[] args) {
        // Strategy pattern
        IPrinter printer = new FirstPrinter();
        printer.print("Hello World! - 1");
        printer = new SecondPrinter();
        printer.print("Hello World! - 2");
        printer = new ThirdPrinter();
        printer.print("Hello World! - 3");

        // Command pattern
        Calculator calculator = new Calculator();
        Command command = new AddCommand(calculator, 10, 2);
        command.execute();
        command = new SubtractCommand(calculator, 5, 5);
        command.execute();
    }
}
