package dsa_self_paced_course.recursion;

public class BinaryConversion {

	public static void BinaryConversion(int N) {
		// TODO Auto-generated constructor stub
		if(N==0)
			return;
		BinaryConversion(N/2);
		System.out.print(N%2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryConversion(2);
	}

}
