package dsa_self_paced_course.recursion;

public class PrintNTo1 {

    public static void printNto1(int N) {
        if (N >= 1) {
            System.out.print(N + " ");
            printNto1(N - 1);
        }
    }

    public static void main(String[] args) {
        printNto1(5);
    }
}
