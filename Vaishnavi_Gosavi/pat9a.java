/*
Pattern:
1 2 3 4 
  2 3 4 
    3 4 
      4 
*/

package pattern;
import java.util.*;

public class pat9a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n = sc.nextInt();
		
		int i = 1;
		
		while(i<=n)
		{
			int j = 1;
			
			while(j<=(i-1))
			{
				System.out.print("  ");
				j++;
			}
			
			int k = 1;
			
			while(k<=(n-i+1))
			{
				System.out.print(i+k-1+" ");
				k++;
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
1 2 3 4 
  2 3 4 
    3 4 
      4 
*/
