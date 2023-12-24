package dsa_self_paced_course.mathematics;

public class computePower {

    public static int computePower(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }

        if (exponent == 0) {
            return 1; // Anything to the power of 0 is 1
        }

        int result = 1;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= base;
            }
            base *= base;
            exponent /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(computePower(2, 3)); // Output: 8
    }
}
