package dsa_self_paced_course.mathematics;

public class EfficientSolutionOfPrimeFactors {

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2 || num == 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;
        else {
            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void primeFactors(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                int x = i;
                while (num % x == 0) {
                    System.out.print(i + " ");
//                    num=num/i;
                    x = x * i;
                }
            }
        }
    }

    public static void main(String[] args) {
        int num = 18;
        System.out.println("Is " + num + " prime? " + isPrime(num));
        System.out.print("Prime factors of " + num + ": ");
        primeFactors(num);
    }
}
