import java.util.Scanner;

public class Main {
    
    // 조합 계산
    public static long combination(int m, int n) {
        // 예: C(m, n) = m * (m - 1) * ... * (m - n + 1) / (n * (n - 1) * ... * 1)
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * (m - i + 1) / i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt(); 
        
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int M = in.nextInt();
            
            System.out.println(combination(M, N));
        }
    }
}
