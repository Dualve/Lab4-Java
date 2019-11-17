package by.bntu.fitr.povt.dubodelov.lab5.controller;

import by.bntu.fitr.povt.dubodelov.lab5.model.logic.Counter;
import by.bntu.fitr.povt.dubodelov.lab5.utils.UserInput;
import by.bntu.fitr.povt.dubodelov.lab5.view.Printer;

public class Manager {
    public static void main(String[] args) {
        int num = UserInput.input("Enter num: ");
        int sum = Counter.sumOfNum(num);

        Printer.outputResult(num, sum);
    }

}
