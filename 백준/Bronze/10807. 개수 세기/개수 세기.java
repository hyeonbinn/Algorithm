import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
   
        int n = in.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
	        arr[i] = in.nextInt();
        }
        
        int v = in.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == v) 
    	        count++;
        }
        
        System.out.println(count);
    }
}