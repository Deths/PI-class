import java.util.Scanner;
public class Problem1 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int x, res;
x = scan.nextInt();
if (x < 0){
x = - x;
}
res = x*3;
System.out.print(res);
}
}