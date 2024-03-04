//package org.example.DfsBfs;

import java.util.Scanner;

public class Main {

    static int N,M;
    static int[][] Graph;
    static boolean[] Visited;
    static int count;

    public static void dfs(int node) {
        Visited[node] = true;

        for (int i = 1; i < N+1; i++) { //N이 1부터이므로 범위 설정 주의!!
            if(!Visited[i] && Graph[node][i] == 1)
                dfs(i);;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        //좌표를 그대로 받아들이기 위해 N+1 크기로 선언.
        Graph = new int[N+1][N+1];
        Visited = new boolean[N+1];

        for (int i = 0; i < M; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            Graph[u][v] = Graph[v][u] =  1;
        }

        count = 0; //count 초기화 선언 위치 주의

        for (int i = 1; i < N+1; i++){ //N범위 주의..!
            if(!Visited[i]){
                dfs(i);
                count++;
            }
        }

        System.out.println(count);

    }

}
