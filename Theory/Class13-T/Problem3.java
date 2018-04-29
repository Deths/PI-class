import java.util.Scanner;
import java.util.Arrays;
public class Problem3{
	public static double[][] transpose(double[][] vector, int row, int column){
		double B[][] = new double[column][row];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				B[j][i] = vector[i][j];
			}
		}
		return B;
	}
	public static void main(String[] args) {
		int row, column;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.print("Put the rows of your matrix: ");
			row = scan.nextInt();
			System.out.print("Put the columns of your matrix: ");
			column = scan.nextInt();
			if(row <= 0 || column <= 0){
				System.out.println("ERROR");
			}
		}while(row <= 0 || column <= 0);
		double A[][] = new double[row][column];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				System.out.print("Fill your matrix: ");
				A[i][j] = scan.nextDouble();
			}
		}
		System.out.print(Arrays.deepToString(transpose(A,row,column)));
	}
}