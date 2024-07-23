class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int width = 3; width <= total; width++) { //3부터 가운데 노란색 가능

            //전체 타일 수를 가로 길이로 나눴을 때 나머지가 0이어야 함
            if (total % width == 0) {
                int height = total / width; //높이 계산
                if (height < 3) continue; //높이가 3 미만이면 continue

                //내부 타일 가로, 세로 계산
                int innerWidth = width - 2; //양옆사이드
                int innerHeight = height - 2; //맨위, 맨아래

                //innerWidth * innerHeight가 노란색 타일의 수와 일치하는지 확인
                if (innerWidth * innerHeight == yellow) {
                    if (width >= height) { // 가로는 세로보다 크거나 같아야함 (문제 조건)
                        return new int[]{width, height};
                    } else {
                        return new int[]{height, width};
                    }
                }
            }
        }
        return new int[0];
    }
}