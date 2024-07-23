class Solution {
      public int[] solution(int[] answers) {
        // answers만큼 찍는 번호들을 묶어 저장하고 하나하나 비교해서 맞은 개수 비교?

        //1번 : 1, 2, 3, 4, 5 를 반복
        //2번 : 2, 1, 2, 3, 2, 4, 2, 5 를 반복
        //3번 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 를 반복

        int[] score = new int[3];

        int[] supoza1 = {1, 2, 3, 4, 5};
        int[] supoza2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoza3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for(int i = 0; i < answers.length; i++) {
            if (answers[i] == supoza1[i % supoza1.length]){
                score[0]++;
            }

            if (answers[i] == supoza2[i % supoza2.length]){
                score[1]++;
            }

            if (answers[i] == supoza3[i % supoza3.length]){
                score[2]++;
            }
        }

        int maxScore1 = Math.max(score[0], score[1]);

        int maxScore2 = Math.max(maxScore1, score[2]);

        int count = 0;
        for (int s : score) {
            if(s == maxScore2)
                count++;
        }

        int[] result = new int[count];
        int index = 0;
        for(int i = 0; i < score.length; i++) {
            if(score[i] == maxScore2)
                result[index++] = i+1;
        }
        
        return result;
    }
}