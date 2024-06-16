import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for(i = 0; i < completion.length; i++) { //정렬 후 더 길이가 짧은 completion만큼 비교
            if (!participant[i].equals(completion[i])) // 참가자와 완주자가 일치하지 않으면 해당 참가자 반환
                return participant[i];
        }
        return participant[i]; //모두 일치하면 맨 마지막 참가자가 완주하지 못한 것 
    }
}
