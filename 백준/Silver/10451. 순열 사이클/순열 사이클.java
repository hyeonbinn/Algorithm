import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt(); 
        while (T-- > 0) {
            int N = in.nextInt();
            int[] permutation = new int[N + 1]; // 순열을 저장할 배열 (1부터 시작하므로 N+1)
            boolean[] visited = new boolean[N + 1]; // 방문 여부
            
            for (int i = 1; i <= N; i++) {
                permutation[i] = in.nextInt(); 
            }
            
            int cycleCount = 0;
            
            for (int i = 1; i <= N; i++) {
                if (!visited[i]) { 
                    dfs(permutation, visited, i);
                    cycleCount++; // 하나의 사이클을 찾았으므로 사이클 수 증가
                }
            }
                   
            System.out.println(cycleCount);
        }
        
        in.close();
    }
    

    private static void dfs(int[] permutation, boolean[] visited, int current) {
        visited[current] = true; 
        int next = permutation[current]; 
        
        if (!visited[next]) { // 다음 노드를 아직 방문하지 않았다면 DFS로 탐색
            dfs(permutation, visited, next);
        }
    }
}
