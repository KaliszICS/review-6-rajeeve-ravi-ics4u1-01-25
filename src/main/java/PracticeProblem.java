import java.util.Scanner;

public class PracticeProblem {

    public static void main(String args[]) {
        // Main method left empty as requested
    }


    public static int sum(int a, int b) {
        return a + b;
    }


    public static int difference(int a, int b) {
        return a - b;
    }


    public static double product(double a, double b) {
        return a * b;
    }


    public static String removeFirst(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(1);
    }


    public static int combinedLength(String str1, String str2) {
        int length1 = (str1 == null) ? 0 : str1.length();
        int length2 = (str2 == null) ? 0 : str2.length();
        return length1 + length2;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }


    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isNegative(int num) {
        return num < 0;
    }
}
