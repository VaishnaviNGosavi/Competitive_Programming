
/*Pattern:

1234554321
1234**4321
123****321
12******21
1********1

*/

package pattern;
import java.util.*;

public class pat9ad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n = sc.nextInt();
		
		int i = 1;
		
		while(i<=n)
		{
			int j1 = 1;
			
			while(j1<=(n-i+1))
			{
				System.out.print(j1+"");
				j1++;
			}
			
			int j2 = 1;
			
			while(j2<=(i-1))
			{
				System.out.print("*");
				j2++;
			}
			
			int k1 = 1;
			
			while(k1<=(i-1))
			{
				System.out.print("*");
				k1++;
			}
			
			int k2 = 0;
			
			while(k2<(n-i+1))
			{
				System.out.print(n-i-k2+1+"");
				k2++;
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
5
1234554321
1234**4321
123****321
12******21
1********1

*/
