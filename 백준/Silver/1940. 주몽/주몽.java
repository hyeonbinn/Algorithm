

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int first = 0;
        int end = N-1;
        int count = 0;

        Arrays.sort(arr);

        while (first < end) {
            if (arr[first] + arr[end] == M) {
                count++;
                first += 1;
                end -= 1;
            } else if (arr[first] + arr[end] > M) {
                end -= 1;
            } else {
                first += 1;
            }
        }

        System.out.println(count);

    }
}
