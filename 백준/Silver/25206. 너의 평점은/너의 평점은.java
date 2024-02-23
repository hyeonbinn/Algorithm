import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str[] = new String[20];

        // 전공평점의 총 합계
        double totalSum = 0;

        // 학점의 총 합계
        double scoreSum = 0;

        String gradeList[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double gradeScore[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        for (int i = 0; i < 20; i++) {
            str[i] = in.nextLine();
            Scanner lineScanner = new Scanner(str[i]); //문자열 str[i]에 대한 스캐너 객체 생성
            String subject = lineScanner.next(); //첫 번째 문자열, 즉 입력된 한 줄에서의 과목명 추출
            double score = lineScanner.nextDouble(); //다음으로 읽을 double 값, 즉 점수 추출
            String grade = lineScanner.next(); //세 번째 문자열, 즉 입력된 한 줄에서의 학점 추출

            for(int j = 0; j < 10; j++) { //배열 인덱스가 (0~9)
                if(grade.equals(gradeList[j])){
                    totalSum += score * gradeScore[j];

                    //'P' 학점은 제외
                    if(j != 9) {
                        scoreSum += score;
                    }
                }
            }

            lineScanner.close();
        }

        // 전공평점 계산
        double majorAverage = totalSum / scoreSum;

        System.out.printf("%.6f\n", majorAverage);

        in.close();
    }
}
