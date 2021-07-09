import java.util.Scanner;

public class findingoddoreven {

	public static void main(String[] args) {
		
		//Finding an integer whether its odd or even
		
		int num;
		
		System.out.println("Enter an integer number");
		
		
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		// Using If and else
		if(num % 2==0)
			System.out.println("Its an even number");
		else
			System.out.println("Its an odd number");
		
		//Using terenery method
		{
			String s=(num % 2==0)?"Even number":"Odd number";
			
			System.out.println((num%2==0)?"even number":"odd number");
			
		}
		
			//using SWITCH/CASE method
		
		switch(num%2)
		{
		case 0:{
			System.out.println("even number ...");
			break;
			}
		case 1:{
			System.out.println("odd number ...");
			break;
		}
		}
		
		
		
		
		
		
		
					}
		}
	
						

			
			
			
			
			
		
		
	


