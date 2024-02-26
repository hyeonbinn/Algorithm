import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int B = in.nextInt();

        ArrayList<Character> list = new ArrayList<>();

        while (N > 0) { //몫이 0보다 큰 경우
            if (N % B < 10) { //나머지가 10보다 작을 경우
                list.add((char) (N % B + '0')); //숫자 그대로 출력 (문자열 리스트에 추가해야 하므로 '0' 더해줌)
            } else { // 10보다 크거나 같을 경우
                list.add((char) (N % B + 55)); //문자(알파벳)로 출력
            }
            N /= B; // B로 나눈 몫 갱신
        }

        for (int i = list.size() -1; i >=0; i--) { //거꾸로 출력해야 하므로
            System.out.print(list.get(i));
        }

        in.close();
    }
}