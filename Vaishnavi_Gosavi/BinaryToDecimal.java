import java.util.*;
import java.lang.Math;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Number: ");
		int binary = sc.nextInt();
		
		int i = 0;
		int dec = 0;
		while(binary != 0)
		{
			int digit = binary%10;
			if(digit == 1)
			{
				dec = digit * (int) (Math.pow(2, i)) + dec; 
			}
			else if(digit == 0)
			{
				dec = dec;
			}
			
			binary = binary/10;
			i++;
		}
		
		System.out.println("Decimal of Given Binary Number is: "+dec);

	}

}
/*
Sample Output:
Enter Binary Number: 
1111
Decimal of Given Binary Number is: 15
*/
