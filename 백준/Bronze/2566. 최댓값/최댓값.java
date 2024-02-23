import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int max = 0;
        int arr[][] = new int[9][9];
        int x = 1; //현재의 위치가 몇 행
        int y =1 ; //몇 열인지 저장하는 변수

        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j]; //max값 갱신
                    x = i+1; //현재 행 저장
                    y = j+1; //현재 열 저장

                }
            }
        }

        in.close();

        System.out.println(max);
        System.out.println(x +" " + y);

    }
}