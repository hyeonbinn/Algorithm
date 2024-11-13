

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 숫자의 개수
        int M = Integer.parseInt(st.nextToken()); // 합을 구해야 하는 개수

        long[] S = new long[N+1]; //구간합 배열 선언
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) { //S[1] = 0 + 5 / S[2] = 5 + 4 ...
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            System.out.println(S[end] - S[first-1]);
        }

    }
}
