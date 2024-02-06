package task1;

public class Validation {
    public static void main(String[] args) {
        System.out.println(isModulo(5));
        System.out.println(sumOfDigits(556));
    }

    public static boolean isModulo(int number) {
        return number % 2 == 0;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

}
