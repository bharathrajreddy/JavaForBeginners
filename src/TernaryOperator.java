import java.util.Scanner;

public class TernaryOperator {
//    it is a compact form of if else statement
//    result = (condition)?Expression1:Expression2
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    String ans = (num%2 == 0)? "Even":"Odd";

    System.out.println(ans);
}
}
