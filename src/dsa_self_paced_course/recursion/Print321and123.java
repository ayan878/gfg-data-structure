package dsa_self_paced_course.recursion;

public class Print321and123 {

	public static void PrintNto1(int N) {
		if(N>=1) {
			System.out.println(N+" ");
			PrintNto1(N-1);
		}
	}
	public static void Print1toN(int N) {
		if(N>=1) {
			Print1toN(N-1);
			System.out.println(N+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNto1(5);
		Print1toN(5);
	}

}
