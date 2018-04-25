import java.util.Scanner;
import java.util.Arrays;
public class Problem2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		float A[][] = new float[3][5];
		float B[][] = new float[3][5];
		float C[][] = new float[3][5];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 5; j++){
			System.out.print("Enter the value of matrix A: line " + (i + 1) + " and column " + (j +1) + " : ");
			A[i][j] = scan.nextFloat();
		    System.out.print("Enter the value of matrix B: line " + (i + 1) + " and column " + (j +1) + " : ");
		    B[i][j] = scan.nextFloat();
		    C[i][j] = A[i][j] + B[i][j];
			}
		}
		System.out.print(" The sum of A and B is: ");
		System.out.print(Arrays.deepToString(C));
	}
}