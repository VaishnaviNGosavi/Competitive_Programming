/*
Pattern:
 *                          * 
 *  *                    *  * 
 *  *  *              *  *  * 
 *  *  *  *        *  *  *  * 
 *  *  *  *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *  *  * 
 *  *  *  *        *  *  *  * 
 *  *  *              *  *  * 
 *  *                    *  * 
 *                          * 
 
 */

package pattern;

import java.util.Scanner;

public class pat9ai {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" * ");
			}
			for(int j = 1; j <= n-i ; j++)
			{
				System.out.print("   ");
			}
			for(int j = 1; j <= n-i; j++)
			{
				System.out.print("   ");
			}
			for(int j = 1; j <=i ; j++)
			{
				System.out.print(" * ");
			}
			
			System.out.println();
		}
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j >= i ; j--)
			{
				System.out.print(" * ");
			}
			for(int j = 1; j <=i-1 ; j++)
			{
				System.out.print("   ");
			}
			for(int j = 1; j <=i-1; j++)
			{
				System.out.print("   ");
			}
			for(int j = n; j >= i ; j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
/*
Enter the value of n: 
5
 *                          * 
 *  *                    *  * 
 *  *  *              *  *  * 
 *  *  *  *        *  *  *  * 
 *  *  *  *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *  *  * 
 *  *  *  *        *  *  *  * 
 *  *  *              *  *  * 
 *  *                    *  * 
 *                          * 
*/
