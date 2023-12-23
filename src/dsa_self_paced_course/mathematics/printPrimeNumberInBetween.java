package dsa_self_paced_course.mathematics;

import java.util.Arrays;

public class printPrimeNumberInBetween {

    public static void sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        // Mark the multiples of each prime number as not prime
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Print the prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Add a newline for better formatting
    }

    public static void main(String[] args) {
        int limit = 20;
        sieveOfEratosthenes(limit);
    }
}
