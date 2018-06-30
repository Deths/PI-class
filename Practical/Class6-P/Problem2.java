import java.util.Arrays;
import java.util.Scanner;
public class Problem2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String v[] = new String[2];
		String f[] = new String[2];
		int j = 1;
		for(int i = 0; i < 2; i++){
			v[i] = scan.nextLine();
			v[i] = f[j];
			j--;
		}
		System.out.print(Arrays.toString(f));
	}
}