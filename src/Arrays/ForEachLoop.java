package Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {5,4,2,7,8,9};
        int key = 20;
        boolean found = false;
        //check whether the key value is present inside my array
        for(int x:arr){
            if(x==key){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Found the key Value");
        }else
            System.out.println("Not Found");
    }
}
