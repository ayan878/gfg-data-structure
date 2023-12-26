package dsa_self_paced_course.recursion;

public class Print1toN {

    public static void print1toN(int N) {
        if (N >= 1) {
            print1toN(N - 1);
            System.out.print(N + " ");
        }
    }

    public static void main(String[] args) {
        print1toN(5);
    }
}
