public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int target = 7;
        int start = 0;
        int finish = arr.length;
        while (start <= finish) {
            int m = start + (finish - start) / 2;

             if (arr[m] == target)
                System.out.println("found at index " + m);
 
            if (arr[m] < target)
                start = m + 1;
 
            else
                finish = m - 1;
        }
     }
}
