package by.bntu.fitr.povt.dubodelov.lab5.model.logic;

public class Counter {
        static final int COAF1 = 1000;
        static final int COAF2 = 100;
        static final int COAF3 = 10;
    public static int sumOfNum(int num) {

        int sum = num/COAF1 + num/COAF2%COAF3 + num/COAF3%COAF3 + num%COAF3;

        return sum;
    }

}
