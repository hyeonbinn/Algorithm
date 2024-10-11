import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int k = in.nextInt();

        int[] scores = new int[N];

        for(int i = 0; i< N; i++) {
            scores[i] = in.nextInt();
        }

        Arrays.sort(scores);

        int cutline = scores[N-k];
        System.out.println(cutline);

    }
}
