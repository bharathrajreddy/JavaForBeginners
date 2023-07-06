package String;

public class StringPool {
    //StringPool ids the area in teh Heap memory where String Literals are stored

    public static void main(String[] args) {
        String s1 = "cba";  // String literal will be stored in heap memory
        String s2 = "cba";  // S2 will be referencing the same string literal
        // Strings using new keyword
        String s3 = new String("cba");
        if(s1 == s3)
            System.out.println("equal");
        else
            System.out.println("not equal");
//        s3 = "def";  // s3 will be referencing def in the memory
//        s2 = "hello world"; // only reference of S2 will be changed

        // Strings using new keyword

        if(s1.equals(s3))
            System.out.println("equal");
        else
            System.out.println("not equal");

    }
}
