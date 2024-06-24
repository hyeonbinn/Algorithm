import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {

        int answer = 0;

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i}); //[우선순위, 인덱스]
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            boolean isPriority = true;

            for (int[] i : queue) {
                if (i[0] > current[0]) { //우선순위가 현재 우선순위보다 더 크면 isPriority를 false로 업데이트
                    isPriority = false;
                    break;
                }
            }

            if (!isPriority)  // 우선순위가 더 높은 게 있으면 current를 다시 큐에 넣음
                queue.add(current);

            else {
                answer++;
                if (current[1] == location)
                    return answer;
            }

        }

        return answer;
    }
}