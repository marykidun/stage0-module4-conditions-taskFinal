package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        String result;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ||)
            System.out.println("31");
         result = ((year % 4 == 0 && year % 100 != 0) ? "leap" : (year % 400 == 0) ? "leap" : "not leap");
        System.out.println(result);

        else if (month == 4 || month == 6 || month == 9 || month == 11)
            System.out.println("30");
            System.out.println(result);
        else if (month == 2 && )
            System.out.println("29");
            System.out.println(result);



    }
}
