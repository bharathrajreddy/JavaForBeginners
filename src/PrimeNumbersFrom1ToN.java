import java.util.Scanner;

public class PrimeNumbersFrom1ToN {
    static int prime(int N){
        int Count =0;
        for(int i=2; i<=Math.sqrt(N); i++){
            if(N%i==0){
                Count++;
                System.out.println("not a Prime NUmber");
                break;
            }
        }
        if(Count==0){
            System.out.println("It is a Prime number");
        }
        return N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=2;i<N; i++){
            prime(i);
        }
    }
}
