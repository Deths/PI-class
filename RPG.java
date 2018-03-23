import java.util.Scanner;
public class RPG{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int weapon , atk , spd;
		String name, w;
		System.out.print("Bem-vindo, como voce chama caro viajante? ");
		name = scan.next();
		System.out.println("Escolha a sua arma inicial");
		System.out.println("Greatsword = 1/ sword = 2/ dagger = 3");
		weapon = scan.nextInt();
		while (weapon > 3){
			System.out.println("Opção invalida no momento, por favor redigite");
			weapon = scan.nextInt();
		}
		switch (weapon){
			case 1:
			System.out.println("Voce escolheu a Greatsword.");
			atk = 10;
			spd = 3;
			break;
			case 2:
			System.out.println("Voce escolheu a sword.");
			atk = 6;
			spd = 6;
			break;
			case 3:
			System.out.println("Voce escolheu a dagger.");
			atk = 3;
			spd = 10;
			break;
			default:
			System.out.println("Opcao invalida no momento.");
			break;
		}
		System.out.print("Vc escolheu"+w);
		
	}

}