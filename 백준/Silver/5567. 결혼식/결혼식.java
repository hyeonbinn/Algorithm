
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 동기 수
        int m = in.nextInt(); // 친구 관계 수


        // 각 노드에 연결된 친구들을 저장할 배열
        ArrayList<Integer>[] friends = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            friends[i] = new ArrayList<>();
        }

        // 친구 관계
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            friends[a].add(b);
            friends[b].add(a);
        }

        // 초대할 친구 찾기 (BFS 이용)
        boolean[] visited = new boolean[n + 1];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{1, 0});  // 상근이와 깊이 0
        visited[1] = true;

        int inviteCount = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentFriend = current[0];
            int depth = current[1];

            if (depth >= 2) continue;  // 친구의 친구까지만 탐색

            for (int friend : friends[currentFriend]) {
                if (!visited[friend]) {
                    visited[friend] = true;
                    queue.add(new int[]{friend, depth + 1});
                    inviteCount++;
                }
            }
        }

        System.out.println(inviteCount);
    }
}
