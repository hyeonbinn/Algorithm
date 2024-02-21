import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
        
		String str = in.nextLine();
        
		int count = 0;
 
		for (int i = 0; i < str.length(); i++) {
 
			char ch = str.charAt(i);
 
			if(ch == 'c') {	 //ch가 c일 경우,
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') { //ch가 c이고, 그 다음 글자(i+1)가 = 라면
						i++; //i를 하나 증가시킴. (하나의 글자로 세기 위함)		
					}
					else if(str.charAt(i + 1) == '-') {
						i++;
					}
				}
			}
		    
			else if(ch == 'd') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'z') {
						if(i < str.length() - 2) {
							if(str.charAt(i + 2) == '=') {	// dz= 일 경우
								i += 2;
							}
						}
					}
		        
					else if(str.charAt(i + 1) == '-') {	// d- 일 경우
						i++;
					}
				}
			}
		    
			else if(ch == 'l') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {	// lj 일 경우
						i++;
					}
				}
			}
		    
			else if(ch == 'n') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {	// nj 일 경우
						i++;
					}
				}
			}
 
			else if(ch == 's') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {	// s= 일 경우
						i++;
					}
				}
		    }
 
			else if(ch == 'z') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {	// z= 일 경우
						i++;
					}
				}
			}
		    
			count++; //조건에 해당하지 않으면 count를 하나로 취급.
 
		}
 
		System.out.println(count);
	}
}