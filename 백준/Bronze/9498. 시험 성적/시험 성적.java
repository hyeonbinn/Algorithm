import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int score = in.nextInt();
        
        in.close();
        
        System.out.print((score>=90)?"A"
                         : (score>=80)? "B"
                         : (score>=70)? "C"
                         : (score>=60)? "D"
                         : "F"); 
        
    }
}