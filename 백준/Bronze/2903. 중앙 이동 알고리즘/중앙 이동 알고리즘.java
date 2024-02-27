import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        //2의 N제곱 + 1의 거듭 제곱
        // Math.pow 반환 타입이 double이므로 int로 형변환
        int result = ((int) Math.pow(Math.pow(2, N) + 1, 2));
        
        System.out.println(result);
    }
}