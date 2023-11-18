package School;


import java.util.*;

public class PrintAlternateElementsofAnArray
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
             GfG gfg = new GfG();
             gfg.print(arr, n);
             System.out.println();
             
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// arr[] is the array 
// n is the number of elements in array.
class GfG
{
    public static void print(int arr[], int n)
    {
        // your code here
    
    	// Base case: If the array is empty, return
        if (n < 0) {
            return;
        }
        
        // Print the last element of the array
        System.out.print(arr[n] + " ");
        
        // Recursive call to print the rest of the array in reverse order
        print(arr, n - 1);
    
        
    }
}