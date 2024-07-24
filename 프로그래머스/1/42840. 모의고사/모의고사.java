class Solution {
      public int[] solution(int[] answers) {
        // answers만큼 찍는 번호들을 묶어 저장하고 하나하나 비교해서 맞은 개수 비교?

        //1번 : 1, 2, 3, 4, 5 를 반복
        //2번 : 2, 1, 2, 3, 2, 4, 2, 5 를 반복
        //3번 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 를 반복

        int[] supoza1 = {1, 2, 3, 4, 5};
        int[] supoza2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoza3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int score1 = 0, score2 = 0, score3 = 0;

        for(int i = 0; i < answers.length; i++) {
            if (answers[i] == supoza1[i % supoza1.length]){
                score1++;
            }

            if (answers[i] == supoza2[i % supoza2.length]){
                score2++;

            }

            if (answers[i] == supoza3[i % supoza3.length]){
                score3++;

            }
        }

        int maxScore1 = Math.max(score1, score2);

        int maxScore2 = Math.max(maxScore1, score3);

        int count = 0;
        if (score1 == maxScore2) count++;
        if (score2 == maxScore2) count++;
        if (score3 == maxScore2) count++;

        int[] result = new int[count];
        int index = 0;
        if (score1 == maxScore2) result[index++] = 1;
        if (score2 == maxScore2) result[index++] = 2;
        if (score3 == maxScore2) result[index++] = 3;

        return result;
    }
}