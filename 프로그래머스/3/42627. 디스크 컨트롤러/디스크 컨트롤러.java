import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        int currentTime = 0; // 현재 시간
        int totalWaitingTime = 0; // 총 대기 시간
        int count = jobs.length; // 작업 수
        int index = 0; // jobs 배열 인덱스

        while (index < jobs.length || !pq.isEmpty()) {
            // currentTime 이전에 요청된 작업들 => heap에 추가
            while (index < jobs.length && jobs[index][0] <= currentTime) {
                pq.offer(jobs[index++]);
            }
            
            if (!pq.isEmpty()) {
                // 소요 시간이 가장 짧은 작업 poll
                int[] currentJob = pq.poll();
                currentTime += currentJob[1];
                totalWaitingTime += currentTime - currentJob[0];
            } else {
               
                if (index < jobs.length) { // 힙이 비어 있으면 
                    currentTime = jobs[index][0]; //currentTime 갱신
                }
            }
        }

        return totalWaitingTime / count;
    }
}