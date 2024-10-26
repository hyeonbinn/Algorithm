
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 0으로 시작하지 않고
        // 1이 연속으로 나타나지 않음

        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // N자리

        long[][] dp = new long[N + 1][2];
        dp[1][1] = 1;
        dp[1][0] = 0;

        for (int i = 2; i <= N; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
            dp[i][1] = dp[i - 1][0];
        }

        System.out.println(dp[N][0] + dp[N][1]);
    }
}
