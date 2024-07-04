import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1); //참가자 이름 해시맵에 추가 or 기존 값 증가
        }

        for (String name : completion) {
            map.put(name, map.get(name) - 1); // 완주자 이름의 등장 횟수 해시맵에서 감소
        }


        for (String name : map.keySet()) {
            if (map.get(name) != 0) {
                return name;
            }
        }
        return "";

    }
}
