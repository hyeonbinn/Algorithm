
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    // 정렬을 한 후, 중복되는 숫자의 앞뒤끝 위치를 알아내는 방법으로 구현
    // 중복 원소 길이 = (맨 끝 위치 + 1)  - 맨 처음 위치

    static int[] arrA;
    static int[] arrB;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arrA = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrA);

        int M = Integer.parseInt(br.readLine());
        arrB = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        // 각 숫자에 대해 해당 숫자가 몇 개 존재하는지 확인
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(upperBound(arrA, arrB[i]) - lowerBound(arrA, arrB[i])).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    // key보다 크거나 같은 값이 처음으로 나타나는 위치
    public static int lowerBound(int[] arr, int key) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= key) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // key보다 큰 값이 처음으로 나타나는 위치
    public static int upperBound(int[] arr, int key) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > key) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}