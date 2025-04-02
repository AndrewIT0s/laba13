package com.example;

public class Main {
    public static void main(String[] args) {
        int t = 10;
        Tester.greet();

        Tester tester = new Tester("Andrew", "Boyko", 10, "Advanced", 4500.0);

        tester.printInfo();
        tester.increaseSalary(2000);
        tester.printInfo();

        if (tester.knowsEnglish()) {
            System.out.println("Этот тестировщик знает английский.");
        }
    }
}
