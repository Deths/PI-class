import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Ex2T3{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int ind = 0, a;
		System.out.println("Type the size of the array: ");
		a = scan.nextInt();
		int A [] = new int[a];
		int B [] = new int[a];
		while(ind < a){
		A [ind] =  rand.nextInt();
		ind++;
		}
		ind = 0;
		while(ind < a){
			B [ind] = A [a - 1 - ind];
			ind++;
		}
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
	}
}