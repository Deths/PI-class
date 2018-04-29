import java.util.Scanner;
public class Problem3{
	public static void main ( String[] args ){
		int num, count = 0;
		float total = 0;
		float nota, avg;
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas notas:");
		num = scan.nextInt();
		while( count < num){
			System.out.println("Digite a nota:");
			nota = scan.nextFloat();
			total = total + nota;
			count++;
		}
		avg = total / num;
		System.out.println("The average is: " + avg);
	}
}