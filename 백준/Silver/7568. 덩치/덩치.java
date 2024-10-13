
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 덩치 순위 = 자기보다 덩치가 큰 (몸무게, 키 둘 다 큰) 사람의 수 + 1
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] info = new int[N][2];

        for(int i = 0; i < N; i++) {
            info[i][0] = in.nextInt();
            info[i][1] = in.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int count = 0;
            for(int j = 0; j < N; j++) {
                if (info[i][0] < info[j][0] && info[i][1] < info[j][1]) {
                    count++;
                }
            }

            System.out.print(count + 1 + " ");
        }

    }
}
