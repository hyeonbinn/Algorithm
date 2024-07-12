import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.offer(s);
        }

        int count = 0;
        int spicy = pq.poll();
        
        while (spicy < K) {
            if (pq.isEmpty()) {
                return -1;
            }
            int mix = spicy + (pq.poll() * 2);
            pq.offer(mix);
            spicy = pq.poll();
            count++;
        }

        return count;
    }
}