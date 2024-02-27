import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        char[][] floor = new char[N][M];

        for(int i = 0; i < N; i++) {
            String str = in.next();
            for (int j = 0; j < M; j++) {
                floor[i][j] = str.charAt(j);
            }
        }

        int sum = 0;

        for(int i = 0; i < N; i++) {
            int count = 0;

            for(int j = 0; j < M; j++) {
                if(floor[i][j] == '-')
                    count++;
                else
                    count = 0;

                if (count == 1)
                    sum++;
            }
        }

        for(int i = 0; i < M; i++) {
            int count = 0;

            for(int j = 0; j < N; j++) {
                if(floor[j][i] == '|')
                    count++;
                else
                    count = 0;

                if(count == 1)
                    sum++;
            }
        }

        System.out.println(sum);
    }
}
