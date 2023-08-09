import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        int[] array1 = new int[30];
        int[] array2 = new int[28];
        
        for(int i = 0; i < array1.length; i++) {
        	array1[i] = i + 1;
        }
        
        for(int j = 0; j < array2.length; j++) {
        	array2[j] = in.nextInt();
        }
        
        for(int i = 0; i < array1.length; i++) {
        	for(int j = 0; j < array2.length; j++) {
            	if (array1[i] == array2[j]) {
                	array1[i] = 0;
                }
            }
        }
        
        for(int i = 0; i < array1.length; i++){
        	if(array1[i] != 0) {
            	System.out.println(array1[i]);
            }
        }
    }
}