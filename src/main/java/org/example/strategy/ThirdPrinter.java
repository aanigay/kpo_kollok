package org.example.strategy;

public class ThirdPrinter implements IPrinter {
    @Override
    public void print(String text) {
        System.out.println("3rd printer printed: " + text);
    }
}
