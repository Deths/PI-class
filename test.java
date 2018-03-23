import java.util.Scanner;
public class test{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double qhd, phd, qs, ps, qse, pse, ph, qh, qc, pc, qo, po, total;
		phd = ps = pse = ph = pc = po = total = 0.0;
		int code;
		int ans;
		System.out.println("   item        |   Code       | Price ");
		System.out.println("Hot dog        |   100        | R$1,20");
		System.out.println("Sandwich       |   101        | R$1,30");
		System.out.println("Sandwich + egg |   102        | R$1,50");
		System.out.println("Hamburger      |   103        | R$1,20");
		System.out.println("Cheeseburger   |   104        | R$1,30");
		System.out.println("Soda           |   105        | R$1,00");
		do{
		System.out.println("Enter a code:");
		code = scan.nextInt();
		switch(code){
			case 100:
			System.out.println("How much Hot dogs do you want?");
			phd = 0.0;
			qhd = scan.nextDouble();
			phd = qhd*1.20;
			System.out.println("Considering only the Hot dogs you will pay" + phd);
			total = phd + total;
			break;
			case 101:
			System.out.println("How much Sandwich do you want?");
			ps = 0.0;
			qs = scan.nextDouble();
			ps = qs*1.30;
			System.out.println("Considering only the Sandwich you will pay" + ps);
			total = ps + total;
			break;
			case 102:
			pse = 0.0;
			System.out.println("How much 'Sandwich + egg' do you want?");
			qse = scan.nextDouble();
			pse = qse*1.50;
			System.out.println("Considering only the 'Sandwich + egg' you will pay" + pse);
			total = pse + total;
			break;
			case 103:
			ph = 0.0;
			System.out.println("How much Hamburger do you want?");
			qh = scan.nextDouble();
			ph = qh*1.20;
			System.out.println("Considering only the Hamburger you will pay" + ph);
			total = total + ph;
			break;
			case 104:
			pc = 0.0;
			System.out.println("How much Cheeseburger do you want?");
			qc = scan.nextDouble();
			pc = qc*1.20;
			System.out.println("Considering only the Cheeseburger you will pay" + pc);
			total = pc + total;
			break;
			case 105:
			po = 0.0;
			System.out.println("How much Soda do you want?");
			qo = scan.nextDouble();
			po = qo*1.00;
			System.out.println("Considering only the hot Soda you will pay" + po);
			total = total + po;
			break;
			default:
			break;
		}
		System.out.println("Do you want to order something more? For Yes, write 1");
		ans = scan.nextInt();
		}while(ans == 1);
		System.out.println(" The total is " + total);
	}
}