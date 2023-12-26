package dsa_self_paced_course.recursion;

public class RopeCuttingProblem {

    public static int ropeCuttingProblem(int length, int a, int b, int c) {
        if (length == 0) {
            return 0;
        }

        if (length < 0) {
            return -1;
        }

        int result = Math.max(
                ropeCuttingProblem(length - a, a, b, c),
                Math.max(ropeCuttingProblem(length - b, a, b, c), ropeCuttingProblem(length - c, a, b, c))
        );
        if (result == -1) {
            return -1;
        }

        return result + 1;
    }

    public static void main(String[] args) {
        System.out.println(ropeCuttingProblem(23, 11, 9, 12));
    }
}
