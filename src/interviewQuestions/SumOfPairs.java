package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class SumOfPairs {
    public static void main(String[] args) {
        int[] arr = {5,3,4,6,2,1,7};
        arraySumUsingSet(arr,8);
//        for(int i=0; i<arr.length-1;i++){
//            for(int j=0; j<arr.length-1; j++){
//                if(arr[i]+arr[j] == 8){
//                    System.out.println("["+arr[i]+","+arr[j]+"]");
//                }
//            }
//        }
    }
    public static void arraySumUsingSet(int[] num, int sum){
        Set set = new HashSet(num.length);

//        for(int i=0; i< num.length; i++){
//            int target = sum - num[i];
//            if(!set.contains(target)){
//                set.add(num[i]);
//            }else {
//                System.out.printf("(%d,%d)%n",num[i], target);
//            }
//        }
        for(int values : num){
            int target = sum - values;
            if(set.contains(target)){
                System.out.printf("(%d,%d)%n",target, values);
            }else
                set.add(values);
        }
    }
}
