import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 1;
        while(N > 0){
            N = scan.nextInt();
         if ( N < 0){
                break;
            }
           else if ( N%2 == 0){
                System.out.println(N + " is even.");
            }
            else if ( N < 0){
                break;
            }
            else{
            System.out.println(N + " is odd.");
            }
        }
    }
}
