
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int t = 0; t < T; t++) {
            int k = in.nextInt(); // 층
            int n = in.nextInt(); // 호

            int[][] apt = new int[k + 1][n + 1];

            // 0층 초기화 (0층의 i호에는 i명이 산다)
            for (int i = 1; i <= n; i++) {
                apt[0][i] = i;
            }

            // 각 층과 호의 사람 수 계산
            for (int i = 1; i <= k; i++) { // 1층부터 k층까지
                for (int j = 1; j <= n; j++) { // 1호부터 n호까지
                    apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
                }
            }


            System.out.println(apt[k][n]);
        }

    }
}
