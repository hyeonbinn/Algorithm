import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        
        for(int i=1 ; i<=T; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("Case #" + i + ": " + (a+b));
        }
    }
}