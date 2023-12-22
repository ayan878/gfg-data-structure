package dsa_self_paced_course.mathematics;

import java.util.Scanner;

public class LCM {

    public static int findLCM() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        sc.close(); // Close the Scanner to avoid resource leaks

        int result = Math.max(a, b);
        while (true) {
            if (result % a == 0 && result % b == 0) {
                return result;
            }
            result++;
        }
    }

    public static void main(String[] args) {
        System.out.println("LCM: " + findLCM());
    }
}
