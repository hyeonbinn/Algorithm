class Solution {
    //dfs
    //순회하면서 해당하는 순서에 바로 return
    private static final char[] ALPHABETS = {'A', 'E', 'I', 'O', 'U'};
    private static int answer;
    private static String currentWord;

    public static int solution(String word) {
        currentWord = word;
        answer = 0;

        for (char c : ALPHABETS) {
            if (dfs(String.valueOf(c))) {
                return answer;
            }
        }
        return answer;
    }

    private static boolean dfs(String str) {
        answer++;
        if (str.equals(currentWord)) {
            return true;
        }
        if (str.length() == 5) {
            return false;
        }

        for (char c : ALPHABETS) {
            if (dfs(str + c)) {
                return true;
            }
        }
        return false;
    }
}