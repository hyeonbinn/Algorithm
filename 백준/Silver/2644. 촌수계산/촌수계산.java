//package org.example.DfsBfs;

import java.util.Scanner;

public class Main {

    static int n,m,x,y,A,B;
    static int [][] Graph;
    static int[] Dist; // 거리


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        A = in.nextInt();
        B = in.nextInt();
        m = in.nextInt();

        Graph = new int[n+1][n+1];
        Dist = new int[n+1];

        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            Graph[x][y] = Graph[y][x] = 1;
        }

        dfs(A);


        System.out.println(Dist[B] == 0 ? -1 : Dist[B]); //경로가 없으면 -1 출력, 있으면 경로 길이 출력
    }

    public static void dfs(int node) {
        if (node == B) // 현재 노드가 B와 같다면 종료
            return;
        
        for (int i = 1; i < n+1; i++) { //노드 방문할 때마다 Dist 갱신해 거리 저장 (필요한 최소 간선 수)
            if(Graph[node][i] == 1 && Dist[i] == 0) {
                Dist[i] = Dist[node]+1;
                dfs(i);
            }
        }

    }
}
