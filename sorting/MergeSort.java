class MergeSort{

    static void divideHelper(int arr[], int lo, int hi){
        if(lo==hi){
            return;
        }
        int mid= (lo+hi)/2;

        divideHelper(arr, lo, mid);
        divideHelper(arr, mid+1, hi);
        merge(arr, lo, mid, hi);

    } 
    public static void main(String[] args) {
        int arr[] ={2,5,4,6,8,1,3,9};
        divideHelper(arr, 0, arr.length-1);
    }
}