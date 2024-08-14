import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] arrA;
    static int[] arrB;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // arrA 길이
            int M = Integer.parseInt(st.nextToken()); // arrB 길이

            arrA = new int[N];
            arrB = new int[M];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arrA[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arrA);

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arrB[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arrB);

            int count = 0;

            // 각 arrA[j]에 대해 arrB에서 자신보다 작은 원소의 개수 더하기
            for (int j = 0; j < N; j++) {
                count += countSmaller(arrB, arrA[j]);
            }
            sb.append(count).append("\n");
        }

        System.out.print(sb.toString());
    }

    // arrB에서 num보다 작은 숫자의 개수를 세는 함수
    public static int countSmaller(int[] arr, int num) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < num) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left; // left >> num보다 작은 숫자의 개수
    }
}
