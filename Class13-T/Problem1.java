import java.util.Scanner;
public class Problem1{
	public static int Fibonacci(int n){
        if (n < 2) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
	public static void main(String[] args){
		int n;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.print("Put the term that you wnat to see: ");
			n = scan.nextInt();
			if( n <= 0){
				System.out.println("ERROR");
			}
		}while(n <= 0);
		System.out.print(Fibonacci(n));
	}
}