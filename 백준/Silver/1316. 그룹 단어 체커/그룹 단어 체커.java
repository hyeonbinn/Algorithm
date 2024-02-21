import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = 0;
        int N = in.nextInt();

        for(int i = 0; i < N; i++) {
            if(isGroupWord(in.next())) //isGroupWord 가 true면 count 증가
                count++;
        }

        System.out.println(count);
        in.close();
    }

    static boolean isGroupWord(String str) {

        boolean words[] = new boolean[26];

        for (int i = 0; i < str.length(); i++) {

            int now = str.charAt(i);

            //현재 인덱스가 0보다 작거나 같을 때 인덱스가 음수가 되지 않도록 0으로 설정
            int prev = (i > 0) ? str.charAt(i - 1) : 0;

            if (words[now - 'a'] == false) //현재 문자가 이전에 등장하지 않았으면
                words[now - 'a'] = true; //값을 true로 설정
            else if (now != prev) //현재 문자가 이미 이전에 등장한 경우이면서 이전 문자와 다르면
                return false; //false 반환
        }

        return true;
    }

}