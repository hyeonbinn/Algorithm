//package org.example.DfsBfs;

import java.util.Scanner;

public class Main {

    static int T;
    static int M,N,K;
    static int[][] Graph;
    static boolean[][] Visited; //방문 여부
    static int count;
    static int[] dx = {0, -1, 0, 1}; //좌우
    static int[] dy = {-1, 0, 1, 0}; //상하

    static void dfs(int x, int y) {
        Visited[x][y] = true;

        for(int i = 0; i < 4; i++) { //상하좌우 4번
            int nr = x + dx[i]; //새로운 행 좌표
            int nc = y + dy[i]; //새로운 열 좌표

            if(nr < 0 || nr > M-1 || nc < 0 || nc > N-1) //범위 벗어나면 continue
                continue;
            if(Visited[nr][nc]) //방문했으면 continue
                continue;
            if(Graph[nr][nc] != 1) //1이 아니면 continue
                continue;

            dfs(nr,nc);
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        T = in.nextInt();

        for(int i = 0; i < T; i++) { //테스트 케이스만큼 반복

            count = 0;

            M = in.nextInt();
            N = in.nextInt();
            K = in.nextInt();

            //M,N 입력받은 후 배열 크기 선언
            Graph = new int[M][N];
            Visited = new boolean[M][N];

            for (int j = 0; j < K; j++) {
                int cx = in.nextInt();
                int cy = in.nextInt();

                Graph[cx][cy] = 1; //테스트 케이스만큼 두 개씩 입력 받아 배열을 1로 세팅
            }

            for(int x = 0; x < M; x++) {
                for(int y = 0; y < N; y++) {
                    if (Graph[x][y] == 1 && !Visited[x][y]) {
                        dfs(x,y);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
