import java.util.Scanner;
import java.util.Arrays;
public class Problem1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int V[] = new int[10];
		int B[] = new int[5];
		int j = 0;
		for(int i = 0; i < 10; i++){
			System.out.print("Put a value: ");
			V[i] = scan.nextInt();
			if(i%2 == 0){
				B[j] = V[i];
				j++;
			}
		}
		System.out.print(Arrays.toString(B));
	}
}