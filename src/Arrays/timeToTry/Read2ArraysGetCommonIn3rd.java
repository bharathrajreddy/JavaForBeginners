package Arrays.timeToTry;

import java.util.Scanner;

public class Read2ArraysGetCommonIn3rd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        for(int i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }
        int[] B = new int[5];
        for(int i=0; i<B.length; i++){
            B[i] = sc.nextInt();
        }
        for(int i=0; i<A.length;i++){
            for(int j=0; j<B.length; j++){
                if(A[i]==B[j]){
                    int[] C = new int[5];
                    int k = 0;
                    C[k] = A[i];
                    System.out.print(C[k]+" ");
                    k++;
                }
            }
        }
    }
}
