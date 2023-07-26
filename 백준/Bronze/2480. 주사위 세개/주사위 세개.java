import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        // 세 숫자가 다 다른 경우
        if (a!=b && b!=c && c!=a) {
            int max;
            
            //a>b
            if(a>b) {
                if(c>a){
                    max = c;
                } else {
                    max = a;
                }
            }
            //a<b
            else {
                if(c>b){
                    max = c;
                } else {
                    max = b;
                }  
            } 
                System.out.println(max*100);
            }
        
        // 1개 이상이라도 같은 수가 있는 경우
        else {
            // 세 숫자가 다 같은 경우
            if (a==b && b==c){
                System.out.println(10000 + a * 1000);
            } else{
                //a==b or a==c
                if(a == b || a == c) {
					System.out.println(1000 + a * 100);
				} 
                else { //b==c
                    System.out.println(1000 + b * 100);
                }
            }
        } 
        
    }
}