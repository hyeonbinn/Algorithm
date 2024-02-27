import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int c = in.nextInt();

        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;

        for(int i = 0; i < c; i++) {
            int money = in.nextInt();
            System.out.print(money / q + " ");
            money %= q;
            System.out.print(money / d + " ");
            money %= d;
            System.out.print(money / n + " ");
            money %= n;
            System.out.print(money / p + " ");
        }
        
        in.close();
    }
}