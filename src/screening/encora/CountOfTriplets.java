package screening.encora;

import java.util.Arrays;

public class CountOfTriplets {
    static int arr[] = new int[]{-2, 0, 1, 3};
    static int TripletsCount(int num, int sum){
        Arrays.sort(arr);
        int result = 0;
        for(int i=0; i<num-2; i++){
            int j=i+1, k = num-1;
            while(j<k){
                if(arr[1]+arr[j]+arr[k] >= sum)
                    k--;

                else{
                    result += (k-j);
                    j++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int sum = 12;
        System.out.println(TripletsCount(arr.length, sum));
    }
}
