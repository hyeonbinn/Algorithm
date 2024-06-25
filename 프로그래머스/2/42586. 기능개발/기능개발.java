import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
   public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remainingDays = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            queue.add(remainingDays);
        }

        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && queue.peek() <= current) {
                queue.poll();
                count++;
            }
            result.add(count);
        }

        int n = result.size();
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = result.get(i);
        }
        return answer;

    }
}