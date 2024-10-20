
import java.util.Scanner;

public class Main {
    /**
     * 영기는 보성이에게 벌주를 먹이고 싶어한다.
     * 영기부터 시작해서 M번 동안 다른 사람들이 순서대로 번호를 부르고,
     * 마지막 M번을 부른 사람이 보성이를 지목하게 되어야 하는 문제
     * 
     * 즉 영기(0번)로부터 시작해서 보성이(K번)가 지목될 때까지 가장 작은 정수 M을 찾는 것이 핵심
     * **/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 참여하는 사람 수
        int K = in.nextInt(); // 보성이 번호 (지게 해야하는 친구)

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int num = 0;
        int count = 0;
        boolean[] visited = new boolean[N];

        while (true) {

            if(visited[num]) {
                System.out.println(-1);
                break;
            }
            visited[num] = true;  // 현재 사람을 방문으로 표시

            if(num == K) {
                System.out.println(count);
                break;
            }

            num = arr[num];
            count++;

        }

    }

}
