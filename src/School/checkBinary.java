package School;

import java.util.*;


public class checkBinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T>0)
		{
			String str = sc.nextLine();
			GfGcheckBinary g = new GfGcheckBinary();
			boolean b = g.isBinary(str);
			if(b== true)
				System.out.println(1);
			else
			    System.out.println(0);
		T--;
		}
	}
}


// } Driver Code Ends


class GfGcheckBinary
{
	boolean isBinary(String str)
	{
		 boolean flag= true;
		  //Your code here
		  int n=str.length();
		  char ch ;
		  for(int i=0;i<n;i++){
		      ch=str.charAt(i);
		      if(ch=='0' || ch=='1')
		      {
		          flag= true;
		      }
		      else {
		          flag=false;
		          break;
		      }
		  }
		  return flag;
	}
}