package functions;

public class VariableArguments {
    public static void main(String[] args) {
        float avg1 = getAvg(2,3,4,5,6);
        float avg2 = getAvg(3,7,9);

        System.out.println(avg1);
        System.out.println(avg2);
    }

    static float getAvg(float ...varargs) {
//        System.out.println(varargs);
//        System.out.println(varargs.getClass().getSimpleName());
        float total =0;
        for(float n : varargs){
            total += n;
        }
        return total/varargs.length;
    }
}
