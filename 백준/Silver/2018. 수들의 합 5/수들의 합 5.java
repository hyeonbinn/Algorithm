
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 투포인터를 사용해 해결
        // sum < N => end를 늘림
        // sum > N => first를 늘림
        // sum = N => end를 늘리고 count를 올림.

        int N = in.nextInt();

        int first = 1;
        int end = 1;
        int count = 1;
        int sum = 1;

        while (end != N) {
            if(sum == N) {
                count++;
                end++;
                sum = sum += end;
            } else if (sum > N) {
                sum = sum-first; //지금까지 더한 거에서 맨 앞 숫자 지우고
                first++; // first 인덱스는 뒤로 옮기기. (순서 중요)
            } else {
                end++;
                sum += end;
            }
        }
        System.out.println(count);
    }
}
