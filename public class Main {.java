class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int target = 7;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("found!");
            }
            
            else{
                System.out.println("not found");
            }
        }
     }
}

