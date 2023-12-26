package dsa_self_paced_course.mathematics;

public class KthBitSet {

    public static boolean isKthBitSet(int num, int k) {
        int x = 1;

        // Left-shift x to the kth position
        x = x << (k - 1);

        // Check if the kth bit is set
        return (num & x) != 0;
    }

    public static void main(String[] args) {
        System.out.println(isKthBitSet(5, 3)); // Output: true (because the 3rd bit is set in binary 5)
    }
}
