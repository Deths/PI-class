import java.util.Scanner;
public class Problem3{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
double avg;
avg = scan.nextDouble();
if (avg < 4){
System.out.print("You failed.");
}
else if(avg < 7){
System.out.print("You can do the recovery exam.");
}
else{
System.out.print("You passed.");
}
}
}