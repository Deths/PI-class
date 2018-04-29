import java.util.Scanner;
public class Problem1 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int f1, f2, n, count, fn = 0;
f1 = f2 = 1;
System.out.println("Put a number:");
n = scan.nextInt();
if(n <= 0){
do{
System.out.println("Try again");
n = scan.nextInt();
}while(n <= 0);
}
if(n == 1 || n == 2){
fn = 1;
}
else if(n == 3){
fn = 2;
}
else{
for(count = 3; count < n; count++){
f2 = f2 + f1;
if(f2 != 2){
f1 = f2 - f1;
}
fn = f1 + f2;
}
}
System.out.println("The result is: " + fn);
}
}