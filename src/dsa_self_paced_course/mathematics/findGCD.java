package dsa_self_paced_course.mathematics;

import java.util.Scanner;

public class findGCD {

	public int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd= new findGCD().gcd(a, b);
		System.out.println("GCD of "+a +" and " +b +" is "+gcd);

	}

}
