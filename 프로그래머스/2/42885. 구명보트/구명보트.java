import java.util.Arrays;

class Solution {
    //2명씩
    //최대한 구명보트를 적게 사용해 모든 사람을 태울 수 있는 방법

    //가장 무거운 사람 + 가장 가벼운 사람 => 최선
    //그게 limit를 넘는다면 무거운 사람을 한 칸씩 앞으로 당겨오면서 가장 가벼운 사람과 더하고 limit와 비교
    //count는 증가 => 혼자 타야하므로

    public int solution(int[] people, int limit) {

        Arrays.sort(people); // [50,50,70,80]
        int count = 0; // 구명보트 수
        int i = 0; //가장 가벼운 사람 인덱스
        int j = people.length-1; //가장 무거운 사람 인덱스


        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
                j--;
            } else {
                j--;
                
            }
            count++;
        }
        
        return count;

    }
}