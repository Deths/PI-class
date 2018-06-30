import java.util.Scanner;
public class Problem5{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num, div, y, x, prime, max, rest;
		prime = max = 0;
		num = scan.nextInt();
		for ( y = 2; y <= num; y++){
			div = 0;
			for(x = 2; x<= y; x++){
				rest = y%x;
				if( rest == 0){
					div = div + x;
				}
			}
			if(div == y){
				prime = y;
			}
			if(max < prime){
				max = prime;
			}
		}
		System.out.print("The last prime number is " + max);
	}
}
