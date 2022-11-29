package algoritms.recursion;

public class SumDigits {

    // sum of all digits in a number

    public static int sumOfDigits(int n) {

        if (n < 1) return n;

        return (n % 10 + sumOfDigits(n / 10));

    }

    // testing

    public static void main(String[] args) {

        System.out.println(sumOfDigits(16)); // 7
        System.out.println(sumOfDigits(1668)); // 21

    }
}
