import java.util.Scanner;
import java.util.Arrays;
public class Problem2{
	public static int Negatives(double[] vector){
		int numneg = 0;
		for(int i = 0; i < vector.length; i++){
			if(vector[i] < 0){
				numneg = numneg + 1;
			}
		}
		return numneg;
	}
	public static double[] fill(Scanner scan, double[] vector){
		for(int i = 0; i < vector.length; i++){
		 	System.out.print("Put a value in your vector: ");
			vector[i] = scan.nextDouble();
		}
		return vector;
	}
	public static void main(String[] args) {
		int size, Neg;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.print("Put the size of your vector: ");
			size = scan.nextInt();
			if(size <= 0){
				System.out.println("ERROR");
			}
		}while(size <= 0);
		double V[] = new double[size];
		fill(scan, V);
		Neg = Negatives(V);
		System.out.print("In your vector has " + Neg + " negatives numbers.");
	}
}