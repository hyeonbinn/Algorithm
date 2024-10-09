
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine(); // 남은 개행 문자 처리 (빼먹지 말자...)

        Set<String> words = new HashSet<>(); //중복 제거

        for(int i = 0; i < N; i++) {
            words.add(in.nextLine());
        }

        List<String> wordList = new ArrayList<>(words); //정렬을 위해 set을 ArrayList형 식으로 변환

        Collections.sort(wordList, (word1, word2) -> {
            if (word1.length() == word2.length()) {
                return word1.compareTo(word2);
            } else {
                return word1.length() - word2.length();
            }
        });

        for (String word : wordList) {
            System.out.println(word);
        }

    }
}
