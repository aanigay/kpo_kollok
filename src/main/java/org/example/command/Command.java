package org.example.command;

public abstract class Command {
    protected Calculator calculator;

    public Command(Calculator calculator) {
        this.calculator = calculator;
    }

    public abstract void execute();
}
