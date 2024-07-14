import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int[] bridge = new int[bridge_length];
        int currentWeight = 0;
        int time = 0; //경과시간
        int truck = 0; 

        while (truck < truck_weights.length || currentWeight > 0) {
            time++;
            
            //다 지나면 무게 줄임
            if (bridge[0] != 0) {
                currentWeight -= bridge[0];
            }
            
            for (int i = 0; i < bridge_length - 1; i++) {
                bridge[i] = bridge[i + 1];
            }
            bridge[bridge_length - 1] = 0;
            
            if (truck < truck_weights.length && currentWeight + truck_weights[truck] <= weight) {
                bridge[bridge_length - 1] = truck_weights[truck];
                currentWeight += truck_weights[truck];
                truck++;
            }
        }

        return time;
    }
}