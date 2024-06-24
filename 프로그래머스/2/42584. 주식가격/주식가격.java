import java.util.Stack;

class Solution {
     public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) { //스택이 비어있지 않고, 현재 가격이 stack.peek() 보다 낮으면
                int index = stack.pop(); //스택에서 pop (index)
                answer[index] = i - index; // 기간 계산
            }
            stack.push(i); //현재 인덱스 push
        }

        // 끝까지 가격이 떨어지지 않은 경우
        while (!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = n - index - 1; // 끝까지 가격이 떨어지지 않은 기간 계산
        }


        return answer;
    }
}