import java.util.Scanner;
import java.util.Arrays;
public class Problem1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int A[][] = new int[3][3];
		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < A[i].length; j++){
				System.out.print(" Enter the value of the row " + (i + 1) + " and column " + (j + 1) + " : ");
				A[i][j] = scan.nextInt();
			}
		}
		System.out.print(" Your elements of the second row are: ");
		Row(A);
	}
	public static void Row(int A[][]){
		for(int l = 0; l < 3; l++){
			System.out.print(A[1][l] + " ");
		}
	}
}