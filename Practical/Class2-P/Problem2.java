import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		age = scan.nextInt();
		if(age < 5){
			System.out.print("Not avaliable.");
		}
		else if (age <=7){
			System.out.print("InfantA");
		}
		else if (age<=11){
			System.out.print("InfantB");
		}
		else if(age <= 13){
			System.out.print("JuvenileA");
		}
		else if(age <= 17){
			System.out.print("JuvenileB");
		}
		else{
			System.out.print("Adults");
		}
	}
}