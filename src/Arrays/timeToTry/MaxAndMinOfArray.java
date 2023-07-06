package Arrays.timeToTry;

import java.util.Scanner;

public class MaxAndMinOfArray {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            if(min > arr[i])
                min = arr[i];
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println(min+" is the minimum number");
        System.out.println(max+" is the maximum number");
    }
}
