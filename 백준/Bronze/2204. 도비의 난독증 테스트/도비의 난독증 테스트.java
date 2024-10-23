import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // 제일 처음 알파벳을 비교해 정렬
        // 만약 동일한 알파벳이 나오면 다음 알파벳으로 비교 후 정렬
        // 정렬시 대소문자 구분 X

        Scanner in = new Scanner(System.in);
        HashMap<String, String> hashMap = new HashMap<>(); 

        while (true) {
            int T = in. nextInt();

            if(T==0) break;

            String[] arr = new String[T];
            for(int i = 0; i < T; i++) {
                arr[i] = in.next();
            }

            for (int i = 0; i < T; i++) {
                String lowerCase = arr[i].toLowerCase();
                hashMap.put(lowerCase,arr[i]);
                arr[i] = arr[i].toLowerCase();

            }

            Arrays.sort(arr);
            System.out.println(hashMap.get(arr[0]));
            
        }

    }
}
