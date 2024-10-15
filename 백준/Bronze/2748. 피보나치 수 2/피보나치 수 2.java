
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        System.out.println(FIBO(N));
    }

    static long FIBO(int N) {

        if (N == 0) return 0;
        if (N == 1) return 1;

        long[] fibo = new long[N+1];
        fibo[0] = 0;
        fibo[1] = 1;

        for(int i = 2; i <= N; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        return fibo[N];
    }
}
