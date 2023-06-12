import java.util.*;
import java.lang.Math;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter n:");
		int n = sc.nextInt();

		int count = 0;
		int ans = 0;
		int i = 0;
		
		if(n > 0)
		{
			System.out.println("1.First Method: Using Integer. \n2.Second Method: Using array.");
			System.out.println("Enter p:");
			int p = sc.nextInt();
			switch(p)
			{
	
				case(1):
				{
					System.out.println("First Method: Using Integer.");
				
				
					while(n!=0)
					{
						int bit = n&1;
						ans =  (bit * (int) Math.pow(10,i)) + ans ;
						n = n>>1;
						i++;
					}
		
					System.out.println(ans);
				
					System.out.println();
					break;
				}
				
				case(2):
				{
				
					System.out.println("Second Method: Using array.");
			
					// Array containing reverse binary number 
					int[] arr = new  int[100];
					while(n!=0)
					{
						int bit = n&1;
						arr[i] = bit;
						n = n>>1;
						i++;
						count++;
					}
			
					
					/*for(int l = 0; l < counti; l++)
					{
						System.out.print(arr[l]+" "); 
			
					}*/
					
					//Reverse of array
					int rev = 0;
					
					for(int j = 0;j<count;j++)
					{
						rev = (arr[j] * (int) Math.pow(10,j)) + rev;
					}
					System.out.println(rev);
					
					System.out.println();
					
					break;
				}
			}
		}
		else if(n < 0)
		{
		
			System.out.println("Third Method: For Negative Numbers.");
	
			int t = n*(-1);
			
			
			// Array containing reverse binary number 
			int[] arre = new  int[100];
			while(t!=0)
			{
				int bit = t&1;
				arre[i] = bit;
				t = t>>1;
				i++;
				count++;
			}
			
			
			/*for(int l = 0; l < county; l++)
			{
				System.out.print(arr[l]+" "); 
	
			}*/
			
			//Reverse of array
			int[] reverse = new int[100];
		    int k1 = count;
		    for (int j = 0; j < count; j++) { 
		    	reverse[k1 - 1] = arre[j]; 
		        k1 = k1 - 1; 
		    }
		    
		   /* System.out.println();
		    System.out.println("Binary: ");
		    for(int j = 0; j < county; j++)
			{
				System.out.print(reverse[j]+" ");
			}*/
		    
		    //Calculating 1s Complement
			for(int l = 0; l < count; l++)
			{	
				if((reverse[l]) == 1)
				{
					reverse[l] = 0;
				}
				else if((reverse[l]) == 0)
				{
					reverse[l] = 1;
				}
			}
			
			/*System.out.println();
			System.out.println("1s Complement: ");
			for(int j = 0; j < county; j++)
			{
				System.out.print(reverse[j]+" ");
			}*/
			 
			//Calculating 2s Complement
			int carry = 1;
			for (int j = count-1 ; j >= 0 ; j--)
			{
				if (reverse[j] == 1 && carry == 1)
				{
					reverse[j] = 1;
				}
				else if(reverse[j] == 0 && carry == 1)
				{
					reverse[j] = 1;
					carry = 0;
				}
				else {
					reverse[j] = reverse[j];
				}
			}
	
		   	/*System.out.println();
		    System.out.println("2s Complement: ");
		    for(int j = 0; j < county; j++)
			{
				System.out.print(reverse[j]+" ");
			}*/
		   
		    //Binary Presentation of Given Negative Number
		    System.out.println("Binary Representation of "+n+" is: ");
		    for(int j = 0; j < count; j++)
			{
				System.out.print(reverse[j]);
			}
		}
	    sc.close();
	}

}













