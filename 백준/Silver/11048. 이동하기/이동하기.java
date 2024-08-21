
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int[][] arr = new int[N][M];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int[][] dp = new int[N][M];
        dp[0][0] = arr[0][0];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i == 0 && j == 0) continue;

                int top = (i > 0) ? dp[i-1][j] : 0; //현재의 윗 칸에서 오는 경우
                int left = (j > 0) ? dp[i][j-1] : 0; //현재의 왼쪽 칸에서 오는 경우
                int diagonal = (i > 0 && j > 0) ? dp[i-1][j-1] : 0; //현재의 대각선 윗 칸에서 오는 경우

                dp[i][j] = arr[i][j] + Math.max(top, Math.max(left, diagonal));
            }
        }

        System.out.println(dp[N-1][M-1]);
    }
}
