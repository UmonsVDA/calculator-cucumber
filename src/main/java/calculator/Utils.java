package calculator;

public class Utils {


    /**
     * Method that calculates the greatest common divisor of two integers
     *
     * @param a The first integer
     * @param b The second integer
     * @return The greatest common divisor of the two integers
     */
    public static Long gcd(Long a, Long b) {
        return b == 0 ? a : gcd(b, a % b);

    }

    public static long pow(long base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
