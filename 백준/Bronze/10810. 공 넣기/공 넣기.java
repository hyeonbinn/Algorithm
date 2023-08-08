import java.util.Scanner;

public class Main {
	public static void main(String[] atgs){
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		int[] array = new int[N+1];
		
		int i = 0; //start
		int j = 0; //end
		int k = 0; //ball
		
		for(int cnt = 0; cnt < M; cnt++) {
			i = in.nextInt();
			j = in.nextInt();
			k = in.nextInt();
            
			for(int cnt2 = i; cnt2 <= j; cnt2++) {
				array[cnt2] = k;
			}
		}
        
		for(i = 1; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
