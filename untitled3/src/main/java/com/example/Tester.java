package com.example;

public class Tester {

    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "Intermediate", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(name + " " + surname + ", Опыт: " + experienceInYears + " лет, Зарплата: $" + salary);
    }

    public void increaseSalary(double amount) {
        salary += amount;
    }

    public boolean knowsEnglish() {
        return englishLevel != null;
    }

    public static void greet() {
        System.out.println("Привет от класса Tester!");
    }
}