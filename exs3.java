import java.util.Scanner;
public class exs3{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		float temp;
		System.out.println("Type the temperature");
		System.out.println("Notice, just put the number.");
		temp = scan.nextFloat();
		if (temp <= 10){
			System.out.print("Very cold temperature.");
		}
		else if (temp <= 30){
			System.out.print("Pleasant temperature.");
		}
		else{
			System.out.print("Very hot temperature.");
		}
	}
}