package Arrays.timeToTry;

import java.util.Scanner;

public class SquaresOnNumbersTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=1; i<=N; i++){
            arr[i-1] = i*i;
            System.out.println(arr[i-1]);
        }
    }
}
