import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int a = n/4;
        
        for(int i=1; i<= a; i++){
            System.out.print("long ");
        }
        System.out.println("int");   
    }
}