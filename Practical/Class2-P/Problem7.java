import java.util.Scanner;
import java.lang.Math;
public class Problem7 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
double x, y;
x = scan.nextDouble();
y = scan.nextDouble();
System.out.println("min(" + x + ", " + y + ") is " + Math.min(x, y));
System.out.println("max(" + x + ", " + y + ") is " + Math.max(x, y));
}
}