import java.util.Scanner;
public class Problem1{
	public static void main(String[] args) {
		int age, y = 0; 
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 15; i++){
			System.out.print("Enter a age: ");
			age = scan.nextInt();
			if(age >= y){
				y = age;
			}
		}
		System.out.print(y);
	}
}