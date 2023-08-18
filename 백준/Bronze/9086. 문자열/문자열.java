import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        String[] array = new String[T+1];
        
        for(int i = 1; i <= T; i++){
            array[i] = in.next();
        }
        
        for(int i = 1; i <= T; i++){
            System.out.print(array[i].charAt(0));
            System.out.println(array[i].charAt(array[i].length()-1));
        }
    }
}