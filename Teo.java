import java.util.Scanner;
import java.util.Arrays;
public class Teo{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int pa [] = new int[20];
		int i, cd, ind, a = 1;
		System.out.println("Type the A0 of an arithmetic progression:");
		i = scan.nextInt();
		System.out.println("Type the common difference: ");
		cd = scan.nextInt();
		for(ind = 0; ind < 20; ind++){
			pa[ind] = i + (a-1)*cd;
			a = a + 1;
		}
		System.out.println(Arrays.toString(pa));
	}
}