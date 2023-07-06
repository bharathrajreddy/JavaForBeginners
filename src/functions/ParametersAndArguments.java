package functions;

public class ParametersAndArguments {
    static void introduce(String name, int age, String[] hobbies){
        System.out.println(name);
        System.out.println(age);
        System.out.println("myHobiies are");
        for(String hobby:hobbies){
            System.out.print(" "+hobby);
        }
    }
    public static void main(String[] args) {
        String [] hobbies = {"cricket", "TV", "programming"};
        introduce("Bharath", 32, hobbies);
    }
}
