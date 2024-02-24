import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        // 5행에 최대 15열 2차원 배열
        char[][] str = new char[5][15];
        
        String input = "";
        for (int i = 0; i < 5; i++) { //행을 의미. 즉 5번 반복
        	input = in.next();
            
            for(int j = 0; j < input.length(); j++) { //열을 의미. 즉 한 행의 문자열 길이만큼 반복
            	str[i][j] = input.charAt(j);
            }
        }
        
        //세로 읽기
        for(int i = 0; i < 15; i++) {
        	for(int j = 0; j < 5; j++) {
            	if(str[j][i] == '\0') //빈 문자열이면 출력 X
                	continue;
                System.out.print(str[j][i]);
            }
        }
    }
}