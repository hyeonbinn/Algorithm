import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
    	Scanner in = new Scanner(System.in);

		int N = in.nextInt(); //과목 개수
		double[] array = new double[N];
		double M = array[0]; //우선 인덱스 0번째에 있는 값을 M으로 초기 설정.
		double sum = 0;
        
		for(int i = 0; i < N; i++) {
			array[i] = in.nextInt();
		}
        
		for(int i = 0; i < N; i++) {
			if(array[i] > M) {
				M = array[i];
			}
		}
        
		for(int i = 0; i < N; i++) {
			array[i] = array[i]/M*100;
			sum += array[i];
		}
        
		double avg = sum / N;
        
		System.out.println(avg);
	}
}