import java.util.Scanner;

public class Main {

    // (100 x 색종이 개수) - 중복 되는 부분
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int paperCount = in.nextInt(); //색종이 개수

        int x = 0;
        int y = 0;
        int duplicateArea = 0;

        boolean[][] paper = new boolean[100][100];

        for(int i = 0; i < paperCount; i++) {
            x = in.nextInt();
            y = in.nextInt();

            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if(paper[j][k]) { // 이미 ture이면
                        duplicateArea++; //중복되는 부분 넓이 증가
                    } else {
                        paper[j][k] = true; //중복되지 않으면, 해당 부분을 true로 체크해두기.
                    }
                }
            }
        }

        int totalArea = paperCount * 100 - duplicateArea;
        System.out.println(totalArea);


    }
}