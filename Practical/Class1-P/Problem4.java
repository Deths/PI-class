import java.util.Scanner;

public class Problem4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, res;
        System.out.print("Put a number: ");
        x = scan.nextInt();
        if (x < 0){
            x = - x;
        }
        res = x*x*x;
        System.out.print("The cube of the number is: " + res);
    }
    
}