import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Count =0;
        for(int i=2; i<=Math.sqrt(N); i++){
            if(N%i==0){
                Count++;
                System.out.println("not a Prime NUmber");
            }
        }
        if(Count==0){
            System.out.println("It is a Prime number");
        }
    }
}
