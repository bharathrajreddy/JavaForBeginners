package Arrays;

import java.util.Scanner;

public class LinearSearch {
    /* Given an array and a key value as input,
    * find the index of the key in the array.
    * Return -1 if it is not present
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // input loop
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int key = sc.nextInt();

        int ans = -1;
        //iterate over the array and update ans if key is found
//        for(int i=0; i<n; i++){
//            if(arr[i]==key){
//                ans = i;
//                break;
//            }
//        }
//        System.out.println(ans);

        //iterates from right to left
        for(int i=n-1; i>=0; i--){
            if(arr[i]==key){
                ans = i;
                break;
            }
        }
        System.out.println(ans);

    }
}
