import java.util.Scanner;
import java.util.Arrays;
public class Problem4{
	public static void main(String[] args){
		float A[][] = new float[4][4];
		float B[][] = new float[4][4];
		float C[][] = new float[4][4];
			System.out.println("Fill your matrix A");
			A = FillMatrix(A);
			System.out.println("Fill your matrix B");
			B = FillMatrix(B);
		C = MultMatrix(A, B);
		System.out.print(Arrays.deepToString(C));
	}
	public static float[][] FillMatrix(float[][] vector){
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
			System.out.print("Line " + i  + " and column " + j + " : ");
			vector[i][j] = scan.nextFloat();
			}
		}
		return vector;
	}
	public static float[][] MultMatrix(float[][] A, float[][] B){
		float vector[][] = new float[A.length][B[0].length];
		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < B[0].length; j++){
				for(int k = 0; k < B.length; k++){
					vector[i][j] = vector[i][j] + (A[i][k] * B[k][j]);
				}
			}
		}
		return vector;
	}
}