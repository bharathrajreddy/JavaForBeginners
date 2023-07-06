import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = (int) (Math.random() * 10 +1);
            if(num == 5)
                break;
            if(num %4 == 0)
                continue;
            System.out.print(num+" ");
        }
    }
}
