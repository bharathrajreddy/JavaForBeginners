package functions;

public class MethodOverloading {
    static int add(int a, int b){
        System.out.print("Inside first add ");
        return a+b;
    }
    static String add(String a, String b){
        System.out.print("Inside second add ");
        return a+b;
    }
    static String add(int a, String b){
        System.out.print("Inside second add ");
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(add(5,4));
        System.out.println(add("hello", "World"));
        System.out.println(add(5, "Apples"));
    }
}
