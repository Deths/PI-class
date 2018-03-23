import java.util.Scanner;
public class Aula1{
	public static void main ( String[] args ){
		int count = 0;
		float total = 0;
		float num, nota, avg;
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas notas:");
		num = scan.nextFloat();
		while( count < num){
			System.out.println("Digite a nota:");
			nota = scan.nextFloat();
			total = total + nota;
			count++;
		}
		avg = total / num;
		System.out.println(avg);
	}
}