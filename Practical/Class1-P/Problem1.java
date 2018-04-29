import java.util.Scanner;
public class Problem1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x, y;
		System.out.print("Put the first number: ");
		x = scan.nextInt();
		System.out.print("Put the second number: ");
		y= scan.nextInt();
		System.out.print("The sum is: " + (x+y));
	}
}