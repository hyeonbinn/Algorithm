

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[][] cards = new int[N][5];

        for (int i = 0; i < N; i++) {  // 각 사람의 카드 정보
            for (int j = 0; j < 5; j++) {
                cards[i][j] = in.nextInt();
            }
        }

        int winner = 0;  // 이긴 사람 번호
        int maxUnitsDigit = -1;  // 가장 큰 일의 자리 수

        for (int i = 0; i < N; i++) {
            int maxDigitForPerson = -1;  // 각 사람의 최댓값 일의 자리 수

            // 세 장의 카드 조합 선택
            for (int j = 0; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 5; l++) {
                        int sum = cards[i][j] + cards[i][k] + cards[i][l];
                        int unitsDigit = sum % 10;  // 합의 일의 자리 수
                        maxDigitForPerson = Math.max(maxDigitForPerson, unitsDigit);
                    }
                }
            }

            // 가장 큰 일의 자리 수를 가진 사람 업데이트
            if (maxDigitForPerson > maxUnitsDigit || (maxDigitForPerson == maxUnitsDigit && i + 1 > winner)) {
                maxUnitsDigit = maxDigitForPerson;
                winner = i + 1;  // 0부터 시작하므로 1을 더해줌
            }
        }

        System.out.println(winner);
    }
}
