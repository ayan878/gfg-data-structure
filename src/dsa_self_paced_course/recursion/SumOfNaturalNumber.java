package dsa_self_paced_course.recursion;

public class SumOfNaturalNumber {

	public static int SumOfNaturalNumber(int N) {
		// TODO Auto-generated constructor stub
		if(N==0)
			return 0;
		else
			return N+SumOfNaturalNumber(N-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(SumOfNaturalNumber(5));
	}

}
