import java.util.Scanner;
public class Problem2{
	public static void main(String args[]){
		float x, y;
		Scanner scan = new Scanner(System.in);
		System.out.println("Write a number:");
		x = scan.nextFloat();
		System.out.println("Write another number:");
		y = scan.nextFloat();
		if (((x%2)==0) && ((y%2)==0)){
			System.out.print("The two numbers entered are even.");
		}
		else if(((x%2)!=0) && ((y%2)!=0)){
			System.out.print("The two numbers typed are odd.");
		}
		else{
			System.out.print("One number is even and the other number is odd.");
		}
	}
}