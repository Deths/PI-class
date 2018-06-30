import java.util.Scanner;
import java.lang.Math;
public class Problem6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x;
		x = scan.nextDouble();
		System.out.println("The floor of " + x + " is " + Math.floor(x));
	}
}