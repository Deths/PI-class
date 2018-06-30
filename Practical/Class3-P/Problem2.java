import java.util.Scanner;
public class Problem2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int value, nc = 0, nt = 0, nf = 0, no = 0, rc, rt, rf, ro;
		do {
			System.out.println("How much will you draw");
			value = scan.nextInt();
		}while(value < 0 || value > 2000);
		nc = value/50;
		rc = value%50;
		nt = rc/10;
		rt = value%10;
		nf = rt/5;
		rf = value%5;
		no = rf/1;
		ro = value%1;
		System.out.print("You will recieve: " + nc + " notes of 50, " + nt + " notes of 10, " + nf + " notes of 5 and " + no + "notes of 1.");
	}
}
