package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public static void swap(int first, int second) {
       int result1 = first = first ^ second;
       int result2 = second = first ^ second;
       result1 = first = first ^ second;
        System.out.println(result1);
        System.out.println(result2);
    }
    public static void main(String[] args) {
        swap(5, 9);
    }
}
