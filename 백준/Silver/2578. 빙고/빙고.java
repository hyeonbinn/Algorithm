
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] cheolsu = new int[5][5];
        boolean[][] marked = new boolean[5][5];

        // 철수 빙고판 채우기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cheolsu[i][j] = in.nextInt();
            }
        }

        // 선생님이 부르시는 숫자들
        for (int i = 0; i < 25; i++) {
            int teacherInt = in.nextInt();

            markedNum(cheolsu, marked, teacherInt);

            int bingoCount = countBingo(marked);

            if (bingoCount >= 3) {
                System.out.println(i + 1);
                break;
            }
        }
    }

    private static void markedNum(int[][] cheolsu, boolean[][] marked, int teacherInt){
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(cheolsu[i][j] == teacherInt) {
                    marked[i][j] = true;
                    return;
                }
            }
        }
    }

    //빙고가 몇 줄인지 카운트
    private static int countBingo(boolean[][] marked) {
        int count = 0;

        //가로줄 체크
        for(int i = 0; i < 5; i++) {
            boolean rowBingo = true;

            for(int j = 0; j < 5; j++) {
                if(!marked[i][j]) { // 해당 칸이 체크되지 않았다면 (true가 아니라면)
                    rowBingo = false; // 현재 가로줄은 빙고가 아님
                    break; // 더 이상 확인할 필요가 없으므로 중단
                }
            }
            if(rowBingo)
                count++; // 현재 가로줄이 빙고일 경우, 빙고 줄 개수를 증가
        }

        //세로줄 체크
        for(int i = 0; i < 5; i++) {
            boolean columnBingo = true;

            for(int j = 0; j < 5; j++) {
                if(!marked[j][i]) { // 열 체크이므로 행열을 바꿔 체크해주면 됨.
                    columnBingo = false;
                    break;
                }
            }
            if(columnBingo)
                count++;
        }

        //대각선 체크 (왼쪽 상단 -> 오른쪽 하단)
        boolean diagBingo1 = true;
        for(int i = 0; i < 5; i++) {
            if(!marked[i][i]) { //왼쪽 상단 -> 오른쪽 하단 : 행열 번호가 같음!!
                diagBingo1 = false;
                break;
            }
        }

        if(diagBingo1)
            count++;


        boolean diagBingo2 = true;
        for(int i = 0; i < 5; i++) {
            if(!marked[i][4-i]) { //오른쪽 상단 -> 왼쪽 하단 : 행은 0~4 / 열은 4~0
                diagBingo2 = false;
                break;
            }
        }

        if(diagBingo2)
            count++;


        return count;

    }

}
