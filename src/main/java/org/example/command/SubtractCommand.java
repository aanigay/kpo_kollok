package org.example.command;

public class SubtractCommand extends Command {
    private int a, b;
    public SubtractCommand(Calculator calculator, int a, int b) {
        super(calculator);
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute() {
        calculator.subtract(a, b);
    }

}
