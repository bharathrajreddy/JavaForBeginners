package String;

import java.util.Scanner;

public class StringChallenge {
    public static String change_char(String s){

            for(int i=1; i<s.length()-1; i++){
                if((s.charAt(0)) == s.charAt(i)){
                    StringBuilder sb = new StringBuilder(s);
                    sb.setCharAt(i,'$');
                    s = sb.toString();
                    break;
                }
            }

        return s;
    }

    public static void main(String[] args) {
//        char ch1 = 's';
////        String c1 = ch1.toString();
//        char ch2 = 'c';
////        String c2 = ch2.toSrting();
//        String s = ch1+ch2+"aler";
//        System.out.println(s);
//
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        String s2 = scn.next();
        if(s1 == s2) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for(int i=1; i<=N; i++){
//            String s = sc.next();
//            System.out.println(change_char(s));
//        }
    }

}
