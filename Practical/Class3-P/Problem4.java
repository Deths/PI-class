public class Problem4 {
    public static void main(String[] args) {
        int num = 2, rest, y;
        while ( num < 50000){
            int a = 0;
            for(y = 1 ; y < num ; y++){
               rest = num%y;
                if(rest == 0){
                    a = a + y;   
                }
            }
            if ( a == num){
                System.out.println(num + "perfect");
            }
            num++;
        }
    }    
}
