import java.util.Scanner;
import java.lang.*;
class Count
{
	static int countStrings(int n)
	{
		int a[] = new int [n];
		int b[] = new int [n];
		a[0] = b[0] = 1;
		for (int i = 1; i < n; i++)
		{
			a[i] = a[i-1] + b[i-1];
			b[i] = a[i-1];
		}
		
		return a[n-1] + b[n-1];
		
	}
	/* Driver program to test above function */
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		int t,j;
		int n = 0;
		System.out.print("Enter the number of test cases :");
		t = s.nextInt();
		for(j=1;j<=t && j<=Math.pow(10,3);j++)
		{
			n=j+1;
			if(n<=Math.pow(10,15))
			{
				System.out.println(n);
			}
			else
				System.out.println("Error");

		}
		System.out.println("The output is:");
		for(j=1;j<=t && j<=Math.pow(10,3);j++)
		{
			n=j+1;
			if(n<=Math.pow(10,15))
			{
				System.out.println(countStrings(n));
			}
		}
		
	}
}
