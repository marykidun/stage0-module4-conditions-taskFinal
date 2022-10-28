package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public static void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && thirdSide + secondSide > firstSide)
            System.out.println("this is a valid triangle");
        else
            System.out.println("it's not a triangle");
    }
    public static void main(String[] args) {
        validate(3, 6, 7);
    }
}
