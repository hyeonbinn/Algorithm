import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String numbers) {

        Set<Integer> primes = new HashSet<>();
//        char[] splitNumArr = new char[numbers.length()];
//
//        for(int i = 0; i < numbers.length(); i++) {
//            char splitNum = numbers.charAt(i);
//            splitNumArr[i] = splitNum;
//        }

        //소수 : 1과 자기 자신 말고는 나누어 떨어 지는 게 없는 수
        //splitNum들로 만들 수 있는 조합
        generatePrimes("", numbers, primes);

        return primes.size();
    }

    private void generatePrimes(String prefix, String remain, Set<Integer> primes) { //generatePrimes("", "123", primes)
        if (!prefix.isEmpty()) {
            int number = Integer.parseInt(prefix); //prifix를 정수로 변환해 저장
            if (isPrime(number)) { //소수이면 primes에 추가
                primes.add(number);
            }
        }

        //각 문자를 prefix에 추가, 나머지 문자들로 새로운 remain 문자열을 만듦
        for (int i = 0; i < remain.length(); i++) {
            //새로운 prefix와 remain 문자열로 generatePrimes 재귀호출
            generatePrimes(prefix + remain.charAt(i), remain.substring(0, i) + remain.substring(i + 1), primes);
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }
}