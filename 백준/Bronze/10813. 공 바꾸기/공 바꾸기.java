import java.util.Scanner;

public class Main {
	public static void main(String[] args){
    	
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int M = in.nextInt();
        
        int array[] = new int[N];
        
        int temp;
        
        for(int i = 0; i < array.length; i++) {
        	array[i] = i + 1; //인덱스 번호와 바구니 수 맞추기 위해 +1
        }
        
       	for (int j = 0; j < M; j++) {
        	int I = in.nextInt();
            int J = in.nextInt();
            
            temp = array[I-1];
            array[I-1] = array[J-1];
            array[J-1] = temp;
        }
        
        for (int k = 0; k < array.length; k++) {
        	System.out.print(array[k] + " " );
        }
    }
}