import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String N = in.next();
        int B = in.nextInt();

        long result = 0;
        int exponent = 0; //지수
        int num = 0; //10진수로 변환한 수를 저장할 변수

        for(int i = N.length()-1; i >= 0; i--) { //문자 끝에서부터 계산
            char ch = N.charAt(i);
            if(ch>='0' && ch<='9')  //0~9 사이이면
                num = ch -'0'; //숫자 그대로 출력 : '0'을 빼줌 (문자 -> 숫자)
            else //A~Z이면
                num = ch - 55; //숫자로 변경해 저장 ('A'는 65, 'A'를 10으로 매핑하기 위해 -55)
            result += num * Math.pow(B, exponent++);
        }

        System.out.println(result);
    }
}