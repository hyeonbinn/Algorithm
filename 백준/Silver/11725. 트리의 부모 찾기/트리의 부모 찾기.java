//package org.example.DfsBfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static boolean[] Visited;
    static int[] ParentNode;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 노드 개수 입력

        // 트리 구현
        ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < n; i++)
            tree.add(new ArrayList<>());

        // 간선
        for (int i = 0; i < n - 1; i++) {
            int n1 = sc.nextInt() - 1; // 인덱스로 사용 하기 위함(노드 번호 -1)
            int n2 = sc.nextInt() - 1;
            tree.get(n1).add(n2);
            tree.get(n2).add(n1);
        }

        Visited = new boolean[n];
        ParentNode = new int[n];

        // BFS
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        Visited[0] = true;
        while (!queue.isEmpty()) {
            int v = queue.remove();
            for (int node : tree.get(v))
                if (!Visited[node]) {
                    Visited[node] = true;
                    queue.add(node);
                    ParentNode[node] = v; // 부모 노드 찾기
                }
        }

        // 루트 노드를 제외한 나머지 노드의 부모 노드 출력
        for (int i = 1; i < n; i++)
            System.out.println(ParentNode[i] + 1);
    }


}
