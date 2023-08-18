import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        String S = in.next();
        
        int sum = 0;
        
        for(int i = 0; i < N; i++) {
            sum += S.charAt(i)-'0';
        }
        
        System.out.print(sum);
    }
}