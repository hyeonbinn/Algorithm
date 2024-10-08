
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String[][] members = new String[N][2];

        for(int i = 0; i < N; i++) {
            members[i][0] = in.next();
            members[i][1] = in.next();
        }

        Arrays.sort(members, (a, b) -> {
            int ageSorting = Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
            return ageSorting;
        });


        for(int i = 0; i < N; i++) {
            System.out.println(members[i][0] + " " + members[i][1]);
        }

    }
}
