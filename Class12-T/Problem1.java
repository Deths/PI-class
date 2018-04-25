import java.util.Scanner;

public class Problem1{
	public static void ValidateInterger(int low, int up){
		Scanner scan = new Scanner(System.in);
		System.out.print("Put a number: ");
		int x = scan.nextInt();
		if( (x <= up) && (x >= low) ){
			System.out.println("The number is in the range.");
		}
		else{
			System.out.println("The number is out of the range.");
		}
	}
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int low, up;
		do{
			System.out.print("Put the low number of your range: ");
			low = scan.nextInt();
			System.out.print("Put the up number of your range: ");
			up = scan.nextInt();
			if(low == up || low > up){
				System.out.println("ERROR" + "\n" + "Try again");
			}
			else{
				ValidateInterger(low,up);
				}
			}while(low == up || low > up);
		}
	}