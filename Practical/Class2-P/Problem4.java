import java.util.Scanner;
import java.lang.Math;
public class Problem4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		x = scan.nextInt();
		System.out.print("|" + x + "| = " + Math.abs(x));
	}
}