package dsa_self_paced_course.mathematics;

public class AllDivisorsofNumber {

	private static void printDivisors(int num) {
		// TODO Auto-generated method stub
		int i;
		for (i = 1; i*i < num; i++) {
			if(num%i==0) {
				System.out.print(+i +" ");
			}
		}
		for (; i>=1; i--) {
			if(num%i==0) {
				System.out.print(" "+num/i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=25;
		System.out.print("All divisors of "+num+":");
		printDivisors(num);

	}

}
