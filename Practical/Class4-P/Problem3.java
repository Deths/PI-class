import java.util.Scanner;
public class Problem3 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int n, count, res, i, div, prime;
System.out.println("Enter a number:");
n = scan.nextInt();
System.out.println("The prime numbers between "+ n +" and 1 is: ");
if(n <= 2){
System.out.println("Any.");
}
for(count = 1; count< n; count++){
prime = 0;
for(i = 2; i <= count; i++){
div = count%i;
if(div == 0){
prime = prime + i;
}
}
if(prime == count){
System.out.println(count);
}
}
}
}