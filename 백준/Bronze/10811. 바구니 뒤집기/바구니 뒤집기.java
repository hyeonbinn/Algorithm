import java.util.*;

public class Main{
	public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int M = in.nextInt();
        int arr[] = new int[N+1];
        
        for(int i = 1; i <= N; i++) {
            arr[i] = i;
        }
        
        for (int a = 0; a < M; a++) {
    		int i = in.nextInt(); //i번 바구니부터
    		int j = in.nextInt(); //j번 바구니까지
    
    		for(int b = i; b <= j; b++) { //i번 바구니부터 j번 바구니까지 역순으로 바꾸는 코드
    			int c = j--; //후위연산. 
        		int temp = arr[b]; 
        		arr[b] = arr[c];
        		arr[c] = temp; //arr[b]와 arr[c]를 바꾸는 연산
                }
            }
        
        for (int i = 1; i <= N; i++){
			System.out.print(arr[i] + " ");
		}
    }
}