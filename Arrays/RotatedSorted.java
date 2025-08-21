public class RotatedSorted {


    static int helper(int arr[] , int target){

        int lo =0 ; 
        int hi = arr.length-1 ;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            // System.out.println(lo+" - "+hi);
            // System.out.println(mid);
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[lo]<=arr[mid]){
                // left part is sortted
                if(arr[lo]<=target && target <= arr[mid]){
                    hi = mid-1;
                }
                else{
                    lo = mid+1;
                }
            }
            else{
                // right part sorted
                if(arr[mid]<=target && target<= arr[hi]){
                    lo = mid+1;
                }
                else{
                    hi = mid-1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,9,10,1,2,3};
        int target = 11;
        System.out.println(helper(arr, target));
    }
}
