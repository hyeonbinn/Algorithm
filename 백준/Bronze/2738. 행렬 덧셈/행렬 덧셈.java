import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();
		int[][] arr = new int[n][m];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < m; j2++) {
					arr[j][j2] += in.nextInt();
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}