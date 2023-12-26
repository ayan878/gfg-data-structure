package dsa_self_paced_course.recursion;

public class SumOfNaturalNumberUsingTailRecursion {

	public static int SumOfNaturalNumber(int N,int k) {
		// TODO Auto-generated constructor stub
		if(N==1)
			return k;
		else 
			return SumOfNaturalNumber(N-1, k+N);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SumOfNaturalNumber(5, 1));
	}

}
