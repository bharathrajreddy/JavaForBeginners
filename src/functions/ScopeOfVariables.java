package functions;

public class ScopeOfVariables {
        static void hello() {
            String s = "Hello everyone";
            System.out.println(s);
        }
        public static void main(String[] args) {
            int a = 5;
            if (true) {
                a = 10;
                System.out.println("Inside the if, a = "+ a);
            }
            System.out.println("Outside the if, a = " + a);
            hello();
            System.out.println(a);
//            System.out.println(s);
        }
}
