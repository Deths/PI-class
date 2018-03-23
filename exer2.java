import java.util.Scanner;

public class exer2 {
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

