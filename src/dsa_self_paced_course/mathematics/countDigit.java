package dsa_self_paced_course.mathematics;

public class countDigit {

	public static int countDigit(int number) {
//		int digits=Integer.MAX_VALUE;
		int count=0;
		
		while(number>0) {
			number=number/10;
			count++;	
		}
		
		return count;
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=12345;
		System.out.println(countDigit.countDigit(number));
}

}
