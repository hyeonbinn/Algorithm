
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

        while (true) {
            boolean isSorted = true;

            for(int i = 0; i < 4; i++) {
                if(arr[i] > arr[i+1]) {
                    change(arr, i, i+1);
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }

    static void change(int arr[],int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        for (int k = 0; k < 5; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}

