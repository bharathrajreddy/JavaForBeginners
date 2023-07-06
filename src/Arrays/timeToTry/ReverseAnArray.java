package Arrays.timeToTry;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int[] revArr = new int[n];
        for(int i=0; i<n; i++){
            revArr[i] = arr[n-i-1];
            System.out.print(revArr[i]+" ");
        }
        int mod = (2+3)%5;
        System.out.println(mod);
    }
}
