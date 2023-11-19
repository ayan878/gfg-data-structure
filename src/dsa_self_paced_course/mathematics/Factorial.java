package dsa_self_paced_course.mathematics;

public class Factorial {
	
	public int factorial(int N) {
		if(N==0 || N==1) {
			return 1;
		}
	return N*factorial(N-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Factorial().factorial(5));

	}

}
