import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
   public int[] solution(String[] operations) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (String operation : operations) {
            String[] parts = operation.split(" ");
            String op = parts[0];
            int num = Integer.parseInt(parts[1]);

            if (op.equals("I")) {
                minHeap.offer(num);
                maxHeap.offer(num);
            } else if (!minHeap.isEmpty()) {
                if (num == -1) {
                    int min = minHeap.poll();
                    maxHeap.remove(min);
                } else {
                    int max = maxHeap.poll();
                    minHeap.remove(max);
                }
            }
        }

        if (minHeap.isEmpty()) {
            return new int[]{0, 0};
        } else {
            return new int[]{maxHeap.peek(), minHeap.peek()};
        }
    }
    }