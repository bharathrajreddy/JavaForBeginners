package String;

public class StringClassMethods {
    public static void main(String[] args) {
        String S1 = "Programmer";
        //length()
        System.out.println(S1.length());
        //charAt()
        System.out.println(S1.charAt(3));
        System.out.println(S1.charAt(9));
        //indexOf
        System.out.println(S1.indexOf('a'));
        System.out.println(S1.indexOf("mm"));
        System.out.println(S1.indexOf("grm"));// if a char/String is not present anywhere in the string
        //equals
        String s2 = new String("Programmer");
        System.out.println(S1==s2);
        System.out.println(S1.equals(s2));
        //contains
        System.out.println(S1.contains("mmer"));
        //toLowerCase, toUpperCase
        System.out.println(S1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(S1);
        System.out.println(s2);
        //replace
        String S3 = S1.replace("Programmer","i @ M Programmer");
        System.out.println(S1);
        System.out.println(S3);
        //subString
        String S4 = S3.substring(6);
        System.out.println(S4);
        S4 = S3.substring(6, 13);
        System.out.println(S4);
        //String Concatenation
        String S5 = S4.concat(S3);
        System.out.println(S5);
        int a =4;
        S5 = a+"hello";
        System.out.println(S5); // toString() is automatically called in case of concatenate non-primitive data types with String.


    }
}
