import java.util.Scanner;

public class areaofrectangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		double length=scan.nextInt();
		System.out.println("Enterthe width of the rectangle");
		double width=scan.nextInt();
		
		double area= length*width;
		System.out.println("The area of the rectangle is :"+area);
		
		
		
	}

}
