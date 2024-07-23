class Solution {
    public int solution(int k, int[][] dungeons) {
        return dfs(dungeons, new boolean[dungeons.length], k, 0, 0);
    }

    private int dfs(int[][] dungeons, boolean[] visited, int currentTired, int maxCount, int count) {
        int m = maxCount;

        for (int i = 0; i < dungeons.length; i++) { //게임 길이만큼 반복
            if (!visited[i] && currentTired >= dungeons[i][0]) { //현재 피로도가 필요 피로도 이상이고 방문하지 않았으면
                visited[i] = true; //방문 표시를 하고
                m = dfs(dungeons, visited, currentTired - dungeons[i][1], m, count + 1); //게임에 참여 후 참여 수 증가 & 현재 피로도에서 소모피로도 제거
                visited[i] = false;
            }
        }

        if(m > count)
            return m;
        else return count;

    }
}