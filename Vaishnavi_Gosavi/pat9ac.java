/*
Pattern:
      1 
    1 2 1 
  1 2 3 2 1 
1 2 3 4 3 2 1 

*/

package pattern;

import java.util.Scanner;

public class pat9ac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n = sc.nextInt();
		
		
		int i = 1;
		
		while(i<=n)
		{
			int j1 = n-i;
			
			while(j1 != 0)
			{
				System.out.print("  ");
				j1--;
			}
			
			int j2 = 1;
			
			while(j2<=i)
			{
				System.out.print(j2+" ");
				j2++;
			}
			
			int j3 = 1;
			
			while(j3<i)
			{
				System.out.print(i-j3+" ");
				j3++;
			}
			
			System.out.println();
			i++;
		}
	
		sc.close();
	}

}
/* 
Output:
Enter the value of n: 
4
      1 
    1 2 1 
  1 2 3 2 1 
1 2 3 4 3 2 1 

*/
