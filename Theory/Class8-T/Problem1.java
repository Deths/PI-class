import java.util.Scanner;
import java.util.Arrays;
public class Problem1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		float sum = 0, avg;
		float V[] = new float[10];
		for(int i = 0; i < 10; i++){
			System.out.print("Put the grades here: ");
			V[i] = scan.nextFloat();
			sum = sum + V[i];
		}
		avg = sum/10;
		System.out.print("The average is: " + avg);
	}
}