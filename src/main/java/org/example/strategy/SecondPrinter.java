package org.example.strategy;

public class SecondPrinter implements IPrinter {
    @Override
    public void print(String text) {
        System.out.println("2nd printer printed: " + text);
    }
}
