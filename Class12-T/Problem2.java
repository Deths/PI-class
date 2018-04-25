import java.util.Arrays;
import java.util.Scanner;
public class Problem2{
	public static void Greatestposition(double[] vector){
		double y = 0; 
		int res = 0;
		for(int i = 0; i < vector.length; i++){
			if(vector[i] > y){
				y = vector[i];
				res = i;

			}
		}
		System.out.print("The position of the greatest value is: " + res);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x;
		do{
			System.out.print("Put the size of the vector: ");
			x = scan.nextInt();
			if(x <= 0){
				System.out.println("ERROR");
			}
		}while(x <= 0);
		double V[] = new double[x];
		for(int i = 0; i < V.length; i++){
			System.out.print("Enter a value for your vector: ");
			V[i] = scan.nextDouble();
		}
		Greatestposition(V);
		}
	}