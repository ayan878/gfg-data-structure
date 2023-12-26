package dsa_self_paced_course.recursion;

public class factorialTailRecursive {

	public static int factorial(int N,int K) {
		if(N==0||N==1)
			return K;
		else {
			return factorial(N-1,K*N);
		}

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5, 1));
	}

}
