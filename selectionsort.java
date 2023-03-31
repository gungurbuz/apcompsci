public class selectionsort {
    public static void main(String[] args){
        int[] arr = {1, 5, 7, 9, 4, 5, 6, 8, 2};
        int min = 0;
        int temp = 0;
        
        for (int i = 0; i < arr.length-1; i++){
            min = i;

            for(int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
}
