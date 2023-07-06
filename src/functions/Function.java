package functions;

public class Function {
    static void tea(){
        System.out.println("Boil water with tea laves and sugar");
        System.out.println( "Add milk and boil for a few minutes");
        System.out.println("Serve the milk tea");
    }

    static void coffee(){
        System.out.println( "Boil some milk");
        System.out.println ("Put some coffee in the cup");
        System.out.println( "Pour the milk into the cup");
    }

    public static void main(String[] args) {
        // Making tea
        tea();
        // Making coffee
        coffee();
        // Making tea
        tea();
        // Making tea
        tea();
        // Making coffee
        coffee();
    }

}
