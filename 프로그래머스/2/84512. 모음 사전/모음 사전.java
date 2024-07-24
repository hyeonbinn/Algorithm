class Solution {
    //dfs
    //순회하면서 해당하는 순서에 바로 return
    private static final char[] ALPHABETS = {'A', 'E', 'I', 'O', 'U'};
    private static int answer;
    private static String currentWord; //AAAAE

    public static int solution(String word) {
        currentWord = word; //AAAAE
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
        if (str.equals(currentWord)) { //str이 currentWord와 같으면 true 반환.
            return true;
        }
        if (str.length() == 5) { //str 길이가 5가 되면 새로운 문자 추가할 수 없으므로 false 반환.
            return false;
        }

        for (char c : ALPHABETS) { // dfs("AA"), dfs("AE"), dfs("AI"), dfs("AO"), dfs("AU")
            if (dfs(str + c)) { //모음 추가해 dfs 호출
                return true;
            }
        }
        return false;
    } // A, AA, AAA, AAAA, AAAAA => false, AAAAE
}