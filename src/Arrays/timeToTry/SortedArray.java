package Arrays.timeToTry;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,4,5,4};
        System.out.println(solve(arr));
    }
    public static int solve(int[] A){
        int value = 1;
        for(int i=0; i<A.length; i++){
            if(A[i] <= A[i+1]){
                value = 1;
            }else{
                value =0;
                break;
            }

        }
        return value;
    }
}
