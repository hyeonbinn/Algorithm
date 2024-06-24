import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};

        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }

        answer = new int[stack.size()];

        for(int i = answer.length -1 ; i >= 0; i--) { //Stack은 LIFL 구조이므로 거꾸로 출력.
            answer[i] = stack.pop();
        }

        return answer;
    }
}