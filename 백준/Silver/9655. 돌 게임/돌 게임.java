import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        boolean[] D = new boolean[N+1];

        if(N >= 1) D[1] = true;
        if(N >= 2) D[2] = false;
        if(N >= 3) D[3] = true;

        for(int i = 4; i <= N; i++) {
            D[i] = !D[i-1] || !D[i-3];
        }

        if(D[N]) {
            System.out.print("SK");
        } else {
            System.out.println("CY");
        }
    }
}
