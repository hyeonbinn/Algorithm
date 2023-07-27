import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int price = in.nextInt(); //총 금액 price
        int count = in.nextInt(); //물건 종류의 수 count
        int sum = 0;
        
        for(int i = 1; i <= count; i++){      
            //count 만큼 입력 받기
            int a = in.nextInt(); //각 물건의 가격 a
            int b = in.nextInt(); //각 물건의 개수 b
            sum = sum + a*b;
        }
        
        if(price == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}