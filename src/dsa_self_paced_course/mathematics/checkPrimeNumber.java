package dsa_self_paced_course.mathematics;

import java.util.Scanner;

public class checkPrimeNumber {
	
	public boolean isPrime(int num) {
		
		if(num==1) {
			return false;
		}
		if(num%2==0||num%3==0) {
			return true;
		}
		for(int i=5;i*i<=num;i+=6) {
			if(num%i==0||num%(i+2)==0) { //example 29,1031
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		System.out.println(new checkPrimeNumber().isPrime(num));
	}

}
