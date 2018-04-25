import java.util.Scanner;
import java.util.Arrays;
public class Problem3{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		float A[] = new float[12];
		float B[] = new float[12];
		float C[][] = new float[2][12];
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 12; j++){
				if(i == 0){
					System.out.print("Enter a value for vector A: ");
					A[j] = scan.nextFloat();
					C[i][j] = A[j]*2;
				}
				else{
					System.out.print("Enter a value for vector B: ");
					B[j] = scan.nextFloat();
					C[i][j] = B[j]/5;
				}
			}
		}
		System.out.print("The matrix C: ");
		System.out.print(Arrays.deepToString(C));
	}
}