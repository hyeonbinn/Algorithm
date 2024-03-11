//package org.example.characterString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static String[] str; // 원본 배열
    static String[] sort_str; // 정렬 배열
    static boolean inc = false; // 오름차순 검사
    static boolean decs = false; // 내림차순 검사

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        in.nextLine();
        str = new String[N];
        sort_str = new String[N];

        // 원본 문자열
        for (int i = 0; i < N; i++) {
            str[i] = in.nextLine();
            sort_str[i] = str[i];
        }

        // 정렬
        Arrays.sort(sort_str);

        // 오름차순 검사
        for (int i = 0; i < N; i++) {
            if (!sort_str[i].equals(str[i])) {
                inc = false;
                break;
            } else {
                inc = true;
            }
        }

        if (inc) {
            System.out.println("INCREASING");
            System.exit(0);
        }

        // 내림차순 검사
        for (int i = 0; i < N; i++) {
            if (!sort_str[N - 1 - i].equals(str[i])) {
                decs = false;
                break;
            } else {
                decs = true;
            }
        }

        if (decs) {
            System.out.println("DECREASING");
            System.exit(0);
        }

        System.out.println("NEITHER");
    }
}
