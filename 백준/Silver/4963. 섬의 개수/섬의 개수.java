//package org.example.DfsBfs;

import java.util.Scanner;

public class Main {

    static int w, h; //높이 h가 행의 개수, 넓이 w가 열의 개수임. 주의!!!
    static int[][] Graph;
    static boolean[][] Visited;
    static int count;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1}; //좌우 + 대각선
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1}; //상하 + 대각선

    public static void dfs(int x, int y) {
        Visited[x][y] = true;

        for (int i = 0; i < 8; i++) { //대각선까지 총 8번 반복
            int nr = x + dx[i];
            int nc = y + dy[i];

            if (nr < 0 || nr > h - 1 || nc < 0 || nc > w - 1)
                continue;
            if (Visited[nr][nc])
                continue;
            if (Graph[nr][nc] != 1)
                continue;
            dfs(nr, nc);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //테스트 케이스가 따로 주어지지 않음. 0 0 을 입력 받을 때까지 반복.
        while (true) {

            w = in.nextInt();
            h = in.nextInt();
            Graph = new int[h + 1][w + 1]; //행,열 헷갈리지 말기..!(h:행의 수/ w:열의 수)
            Visited = new boolean[h + 1][w + 1];
            count = 0;

            if (w == 0 && h == 0) //w,h 둘 다 0 입력 시 반복문 빠져나감.
                break;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    Graph[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!Visited[i][j] && Graph[i][j] == 1) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}