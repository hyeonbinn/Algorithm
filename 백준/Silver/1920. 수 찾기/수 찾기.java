import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arrA;
    static int[] arrB;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄 입력
        int N = Integer.parseInt(br.readLine());
        arrA = new int[N];

        // 두 번째 줄 입력 (N개의 정수)
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정렬
        Arrays.sort(arrA);

        // 세 번째 줄 입력
        int M = Integer.parseInt(br.readLine());
        arrB = new int[M];

        // 네 번째 줄 입력 (M개의 정수)
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        // 각 이진 탐색을 수행
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (binarySearch(arrA, arrB[i])) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }

        // 결과 출력
        System.out.print(sb.toString());
    }

    public static boolean binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
