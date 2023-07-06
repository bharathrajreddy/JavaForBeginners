package functions;

public class ReturnTypes {
    public static void main(String[] args) {
        System.out.println(square(9));
        System.out.println(square(1991));
        hello();
        String [] arr = heroes();
        for(String hero : arr){
            System.out.println(hero);
        }
    }
    static int square(int num){
        return num*num;
    }
    static String[] heroes(){
        String[] superHeroes = {"IronMan", "Thor", "SpiderMan"};
        return superHeroes;
    }
    static void hello(){
        System.out.println("Hello World");
    }
}
