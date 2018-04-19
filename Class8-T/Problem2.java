import java.util.Scanner;
import java.util.Arrays;
public class Problem2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int dif;
		int PA[] = new int[20];
		System.out.print("Enter the initial term of your PA: ");
		PA[0] = scan.nextInt();
		System.out.print("Enter the commom diference: ");
		dif = scan.nextInt();
		for(int i = 1; i < 20; i++){
			PA[i] = PA[i - 1] + dif;
		}
		System.out.print(Arrays.toString(PA));
	}
}