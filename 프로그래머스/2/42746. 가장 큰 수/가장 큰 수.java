import java.util.*;

class Solution {
    public String solution(int[] numbers) {

        // 숫자를 문자열로 변환
        String[] num = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            num[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(num, (o1, o2) -> (o2 + o1).compareTo(o1 + o2)); //조합했을 때 큰 조합으로 정렬

        String answer = "";
        for(int i = 0; i < num.length; i++) {
            answer += num[i];
        }

        if(answer.charAt(0) == '0') { 
            return "0";
        }

        return answer;
    }
}