
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] DP = new int[N+1];

        if(N >= 1) DP[1] = 1;
        if(N >= 2) DP[2] = 3;

        for(int i = 3; i <= N; i++) {
            DP[i] = (DP[i-1] + DP[i-2]*2)%10007;
        }

        System.out.println(DP[N]);

    }
}
