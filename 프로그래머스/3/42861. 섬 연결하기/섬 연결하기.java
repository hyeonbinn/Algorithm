import java.util.Arrays;

class Solution {
    public static int solution(int n, int[][] costs) {
            int[] parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }

            Arrays.sort(costs, (a, b) -> a[2] - b[2]);

            int cost = 0;
            for (int[] edge : costs) {
                if (find(edge[0], parent) != find(edge[1], parent)) {  // 두 노드가 다른 집합에 속해 있다면
                    cost += edge[2]; // 해당 간선을 선택하고 비용을 더함
                    union(edge[0], edge[1], parent); // 두 집합을 합침
                }
            }

            return cost;
        }

        public static int find(int v, int[] parent) {
            if (v == parent[v]) return v;
            return parent[v] = find(parent[v], parent);
        }

        public static void union(int a, int b, int[] parent) {
            int rootA = find(a, parent);
            int rootB = find(b, parent);
            if (rootA != rootB) parent[rootA] = rootB; // 서로 다른 집합이라면 한 집합을 다른 집합에 합침
        }
}