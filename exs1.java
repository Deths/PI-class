import java.util.Scanner;
public class exs1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); 
		float x;
		System.out.println("Write a number:");
		x = scan.nextFloat();
		if ((x%2)==0){
			System.out.print("The number is even");
		}
		else{
		System.out.print("The number is odd");
		}
	}
}