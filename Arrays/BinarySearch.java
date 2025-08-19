public class BinarySearch {
    static int helper(int arr[], int target){
        int lo = 0;
        int hi = arr.length-1;

        while(lo<hi){
            int middle =( lo+hi) /2;
            if(arr[middle] == target){
                return middle;
            }
            else if(arr[middle] < target){

                lo = middle+1;
            }
            else {
                hi = middle-1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,8,11,15,17};
        int index  = helper(arr, 14);
        System.out.println(index);
    }
}
