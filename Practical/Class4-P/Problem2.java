import java.util.Scanner;
public class Problem2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int fac, res = 1, count;
System.out.println("Enter a positive number:");
fac = scan.nextInt();
if(fac < 0){
do{
System.out.println("Try again");
fac = scan.nextInt();
}while(fac < 0);
}
else{
for(count = 1; count <= fac; count++){
res = count*res;
}
}
System.out.println("The factorial of " + fac + " is " + res);
}
}