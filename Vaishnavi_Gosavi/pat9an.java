import java.util.Scanner;

public class pat9an {

	static int fact(int n)
	{
		int fact = 1;
		for(int i = 1; i <= n; i++)
		{
			fact *= i;
		}
		return fact;
	}
	
	static int Calculate_nCr(int n, int r)
	{
		int num = fact(n);
		int deno= ((fact(r))*(fact(n-r)));
		
		int ans = num / deno;
		
		return ans;
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n-i ; j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j <= i; j++)
			{
				System.out.print(Calculate_nCr(i,j)+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
/*
Enter the value of n:
5
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
*/
