package org.example.strategy;

public class FirstPrinter implements IPrinter {
    @Override
    public void print(String text) {
        System.out.println("1st printer printed: " + text);
    }
}
