package dsa_self_paced_course.mathematics;

public class computePowerUsingRecursionInEffiecientSolution {

	public static int computePower(int base, int exponent) {
		// TODO Auto-generated constructor stub
		if(exponent<0)
			throw new IllegalArgumentException("Exponent must be non-negative");
		if(exponent==0)
		   return 1;
		
		int halfPower=computePower(base, exponent/2);
		halfPower=halfPower*halfPower;
		if(exponent%2==0)
			return halfPower;
		else
			return base*halfPower;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Power of "+computePower(3, 4));
	}

}
