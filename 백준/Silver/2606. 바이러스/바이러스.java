//package org.example.DfsBfs;

import java.util.Scanner;

public class Main {
    static int N, E; //컴퓨터 수, 연결된 선의 개수
    static int[][] Graph;
    static boolean[] Visited; //방문 여부
    static int count = 0;

    static void dfs(int node) {
        Visited[node] = true;

        for(int i = 1; i < N+1; i++) {
            if(!Visited[i] && Graph[node][i] == 1) { //아직 방문하지 않았고, 연결되어 있으면 dfs 호출
                dfs(i);
                count++;
            }
        }
    }

    public static void main(String[] args) throws Exception{

        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        E = in.nextInt();
        Graph = new int[N+1][N+1];
        Visited = new boolean[N+1];

        for(int i = 0; i < E; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            Graph[u][v] = Graph[v][u] = 1; //연결되어 있으면 1로 표시 (방향성 X)
        }
        dfs(1);
        System.out.println(count);
    }
}
