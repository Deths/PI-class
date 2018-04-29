import java.util.Scanner;
import java.lang.Math;
public class Problem5 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
double x;
x = scan.nextDouble();
System.out.println(x + " is approximately " + Math.round(x));
System.out.print("The ceiling of " + x + " is " + Math.ceil(x));
}
}