package Arrays;

public class PrintPrimesFrom1toN {
    public static void main(String[] args) {
        int N = 49;
        for(int i=2; i<=N; i++){
            solve(i);
        }
    }
    public static int[] solve(int A) {
        int[] arr = {};
        int Count = 0;
        for(int i=2; i<=Math.sqrt(A); i++){
            if(A%i==0){
                Count++;
            }
        }
        if(Count==0){
            System.out.print(A+" ");
        }
        return arr;
    }
}
