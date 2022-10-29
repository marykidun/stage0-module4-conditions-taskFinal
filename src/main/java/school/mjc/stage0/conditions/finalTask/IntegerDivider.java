package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public static void printCompletelyDivided(int dividend, int divider) {
        int result;
        result = ((dividend / divider) * divider);
        if (result % dividend == 0)
            System.out.println("can be divided completely");
        else if (divider == 0)
            System.out.println("division by zero");
        else
            System.out.println("cannot be divided completely");

    }
    public static void main(String[] args) {
        printCompletelyDivided(3, 1);
    }
}
