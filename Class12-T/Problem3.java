import java.util.Scanner;
import java.util.Arrays;
public class Problem3{
	public static char TrueFalse(double [][] vector){
		char ans = 'F';
		for(int i = 0; i < vector.length; i++){
			int sum = 0;
			for(int j = 0; j<vector[i].length; j++){
				if(vector[i][j] == 0){
					sum = sum + 1;
				}
				if(sum == (j + 1)){
					ans = 'T';
				}
			}
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i = 1, j = 1;
		do{
			System.out.print("Put how many rows: ");
			i = scan.nextInt();
			System.out.print("Put how many columns: ");
			j = scan.nextInt();
			if(i <= 0 || j <= 0){
				System.out.println("ERROR");
			}
		}while(i <= 0 || j <= 0);		
		double V[][] = new double[i][j];
		for(int I = 0; I < i; I++){
			for(int J = 0; J < j; J++){
				System.out.print("Put a value for your Matrix: ");
				V[I][J] = scan.nextDouble();
			}
		}
		if ( TrueFalse(V) == 'T'){
			System.out.print(" There is a row filled with zero.");
		}
		else{
			System.out.print("There isn't a row filled with zero.");
		}
	}	
}