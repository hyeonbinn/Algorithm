import java.util.*;

class Solution {
    public int solution(int[] nums) {

        HashSet<Integer> phonekemon  = new HashSet<>();

        for(int num : nums) {
            phonekemon.add(num);
        }

        int maxPick = nums.length / 2;

        return Math.min(phonekemon.size(), maxPick);
    }
}
