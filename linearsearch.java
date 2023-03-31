public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int target = 7;
        boolean found = false;
        for(int i=0; i < arr.length && !found; i++){
            if(arr[i] == target){
                System.out.println("found!");
                found = true;
            }

            }
            if (!found) System.out.println("not in array");
     }
     
}

