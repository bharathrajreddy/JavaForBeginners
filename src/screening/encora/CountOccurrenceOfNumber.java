package screening.encora;

public class CountOccurrenceOfNumber {
    static int numberBinarySearch(int arr[], int k, int l, int m) {
            if (l < k)
                return -1;

            int midNum = k + (l - k) / 2;
            if (arr[midNum] == m)
                return midNum;

            if (arr[midNum] > m)
                return numberBinarySearch(arr, k,
                        midNum - 1, m);

            return numberBinarySearch(arr, midNum + 1, l, m);
        }
        static int numberOccurrencesCount(int arr[],
                                          int num, int x)
        {
            int index = numberBinarySearch(arr, 0,
                    num - 1, x);

            if (index == -1)
                return 0;

            int count = 1;
            int left = index - 1;
            while (left >= 0 &&
                    arr[left] == x)
            {
                count++;
                left--;
            }

            int right = index + 1;
            while (right < num &&
                    arr[right] == x)
            {
                count++;
                right++;
            }

            return count;
        }

        public static void main(String[] args)
        {
            int arr[] = {1, 2, 2, 2, 2,
                    3, 4, 7, 8, 8};
            int num = arr.length;
            int x = 2;
            System.out.print(numberOccurrencesCount(arr, num, x));
        }

}
