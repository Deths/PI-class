import java.util.Scanner;
public class Problem2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x, y;
		System.out.print("Put the first number: ");
		x = scan.nextInt();
		System.out.print("Put the second number: ");
		y= scan.nextInt();
		System.out.println("The sum is: " + (x+y));
		System.out.println("The subtraction is: " + (x-y));
		System.out.println("The multiplication is: " + (x*y));
		System.out.println("The division is: " + (x/y));
		System.out.println("The average is: " + ((x+y)/2));
	}
}