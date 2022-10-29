package school.mjc.stage0.conditions.finalTask;

import javax.swing.*;

public class DaysInMonth {
    public static void printDays(int year, int month) {
        switch(month) {
            case (2):
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    System.out.println("Leap, 29 days");
                } else if (year <= 0) {
                    System.out.println("invalid date");
                } else {
                    System.out.println("Not leap, 28 days");
                }
                break;

            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                System.out.println("31");

                break;
            case (4):
            case (6):
            case (9):
            case (11):
                System.out.println("30");
                break;


            default:
                System.out.println("invalid date");
                break;

        } }

        public static void main(String[] args) {
            printDays(1985, 3);
}
}