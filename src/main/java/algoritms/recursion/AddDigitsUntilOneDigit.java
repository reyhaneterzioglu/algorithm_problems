package algoritms.recursion;

public class AddDigitsUntilOneDigit {

    /**
     * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
     * Example 1:
     * Input: num = 38
     * Output: 2
     * Explanation: The process is
     * 38 --> 3 + 8 --> 11
     * 11 --> 1 + 1 --> 2
     * Since 2 has only one digit, return it.
     * Example 2:
     * Input: num = 0
     * Output: 0
     */

    public static int sumOfDigitsUntilOneDigit(int n) {

        int sum = 0;

        if (n < 1) return n;

        sum += n % 10 + sumOfDigitsUntilOneDigit(n / 10);

        if (sum > 9) {

            return sumOfDigitsUntilOneDigit(sum);
        }

        return sum;
    }


    // testing

    public static void main(String[] args) {


        System.out.println(sumOfDigitsUntilOneDigit(1668)); //21 -> 3 ==> 3
        System.out.println(sumOfDigitsUntilOneDigit(333348)); //24 -> 6 ==> 6

    }
}
