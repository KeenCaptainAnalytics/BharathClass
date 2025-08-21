public class BinarySearch2 {

    static int helper(int arr[], int target){
        int lo = 0;
        int hi= arr.length-1;
        while(lo<=hi){
            int mid= (lo+hi)/2;
            if(arr[mid]== target){
                return mid;
            }
            else if(arr[mid]<target){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,89,109};
        int result = helper(arr, 1);
        System.out.println(result);
    }
}
