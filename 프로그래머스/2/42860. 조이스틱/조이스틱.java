class Solution {
    // 앞에서 세는 것과 뒤에서 세는 것 중 더 적은 것을 찾아 더하기
    //J = 9
    //A = 0
    //N = 커서 1 + 13

    public int solution(String name) {

        int count = 0;
        int length = name.length();
        int move = length - 1;

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            int order = alphabetOrder(c);
            int reverse = alphabetReverse(c);
            count += Math.min(order, reverse);

            // 좌우 조작 횟수 계산
            int next = i + 1;
            while (next < length && name.charAt(next) == 'A') {
                next++;
            }
            move = Math.min(move, i + length - next + Math.min(i, length - next));
        }

        count += move;
        return count;
    }

    public int alphabetOrder(char alphabet) { // A부터 세는 것
        alphabet = Character.toLowerCase(alphabet);
        return alphabet - 'a';
    }

    public int alphabetReverse (char alphabet) { // Z부터 세는 것
        alphabet = Character.toLowerCase(alphabet);
        return 'z' - alphabet + 1;
    }
}

//"JEROEN"
//9
//1+4
//1+9
//1+12
//1+4
//1+13