package by.bntu.fitr.povt.balkis.lab4.controller;

import by.bntu.fitr.povt.balkis.lab4.model.logic.Counter;
import by.bntu.fitr.povt.balkis.lab4.utils.UserInput;
import by.bntu.fitr.povt.balkis.lab4.view.Printer;

public class Manager {
    public static void main(String[] args) {
        System.out.println();
        int day = UserInput.input("Enter your birth day: ");
        int month = UserInput.input("Enter your birth month: ");
        int year = UserInput.input("Enter your birth year: ");

        int result = Counter.countingDays(day, month, year);

        Printer.outputResult(result);
    }
}
