import java.util.Arrays;

class Solution {
     public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
        int index = 0;

        for(int[]  num : commands) {
            int i = num[0];
            int j = num[1];
            int k = num[2];

            int[] splitArray = Arrays.copyOfRange(array, i-1, j);

            Arrays.sort(splitArray);


            answer[index] = splitArray[k-1];

            index++;
        }

        return answer;
    }
}