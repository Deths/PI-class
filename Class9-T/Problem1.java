import java.util.Scanner;
import java.util.Arrays;
public class Problem1{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int G[][] = new int[20][5];
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 5; j++){
				System.out.print("Insert the student " + (i + 1) + " grade of the class " + (j + 1) +": ");
				G[i][j] = scan.nextInt();
			}
		}
		printMatrix(G);
	}
public static void printMatrix(int G[][]) {
	for(int i = 0; i < G.length; i++){
		for(int j = 0; j < G[i].length; j++){
			System.out.print(G[i][j] + " ");
		}
		System.out.print("\n");
		}
	}
}