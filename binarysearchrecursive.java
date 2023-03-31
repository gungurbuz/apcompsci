public class binarysearchrecursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int target = 4;
        System.out.println(binarySearch(target,arr));

    }
    public static boolean binarySearch(int target, int[] arr){
        return bSearch(0, arr.length, target, arr);
    }

    private static boolean bSearch(int start, int end, int target, int[] arr){
        if (start > end)return false;
        int mid = (end+start)/2;
        if (arr[mid] == target){
            return true;
        }


        else{
            if (arr[mid] > target){
                return bSearch(start, mid - 1, target, arr);
            }

            else {
                return bSearch(mid + 1, end, target, arr);
            }
            

        }
    }


}