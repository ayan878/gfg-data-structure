package dsa_self_paced_course.mathematics;

import java.util.Scanner;

public class TrailingZeroesInFactorial {
	
	public long Factorial(int N) {
		if(N==0 || N==1) {
			return 1;
		}
		
	return N*Factorial(N-1);
	}
	
    public static int countTrailingZeros(long num) {
        int count = 0;
        while (num % 10 == 0) {
            count++;
            num /= 10;
        }
        return count;
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int number=sc.nextInt();
		
		int factorial=new Factorial().factorial(number);
		System.out.println("Factorial of " +number+" = "+ factorial);
		int trailZeroes=new TrailingZeroesInFactorial().countTrailingZeros(factorial);
		System.out.println("TrailZeroes:"+trailZeroes);
		
	}
}
