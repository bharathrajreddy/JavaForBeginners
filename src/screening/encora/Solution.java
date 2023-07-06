package screening.encora;
import java.util.Arrays;

public class Solution {
        static int numCount(int arr[], int x, int n)
        {
            int i;
            int j;
            i = firstNum(arr, 0, n-1, x, n);

            if(i == -1)
                return i;

            j = lastNum(arr, i, n-1, x, n);

            return j-i+1;
        }

        static int firstNum(int arr[], int min, int max, int x, int n)
        {
            if(max >= min)
            {
                int mid = (min + max)/2;
                if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x)
                    return mid;
                else if(x > arr[mid])
                    return firstNum(arr, (mid + 1), max, x, n);
                else
                    return firstNum(arr, min, (mid -1), x, n);
            }
            return -1;
        }

        static int lastNum(int arr[], int min, int max, int x, int n)
        {
            if(max >= min)
            {
                int mid = (min + max)/2;
                if( ( mid == n-1 || x < arr[mid+1]) && arr[mid] == x )
                    return mid;
                else if(x < arr[mid])
                    return lastNum(arr, min, (mid -1), x, n);
                else
                    return lastNum(arr, (mid + 1), max, x, n);
            }
            return -1;
        }

        public static void main(String args[])
        {
            int arr[] = {1, 2, 2, 3, 3, 3, 3};

            // Element to be counted in arr[]
            int x = 3;
            int n = arr.length;
            int c = numCount(arr, x, n);
            System.out.println("number "+x+" has Occurred "+c+" times");
        }
    }

