package String;

public class StringVsCharArrays {
    public static void main(String[] args) {
        // Both Stings and Char Arrays will alow us to Store and handle sequence of characters. But they are different in some properties.

        /*sequence of chars represened as a single data type        Sequential collection of char data type
        Immutable                                                   Mutable
        Offers several built in methods                             No builtin methods
        Stored in the String pool                                   Stored in Heap Memory
         */
        String str = "Hello";
        char[] arr = {'H','e','l','l','o'};

        System.out.println(str);
        System.out.println(arr);

        char[] arr2 = str.toCharArray();
        System.out.println(arr2);
        String str2 = new String(arr);
        System.out.println(str2);
    }
}
