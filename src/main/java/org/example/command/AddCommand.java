package org.example.command;

public class AddCommand extends Command {
    private int a, b;
    public AddCommand(Calculator calculator, int a, int b) {
        super(calculator);
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute() {
        calculator.add(a, b);
    }
}
