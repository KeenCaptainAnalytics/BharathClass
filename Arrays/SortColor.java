public class SortColor {
    public static void main(String[] args) {
        int arr[]={0,1,1,1,1,2,2,2,0,2,2,0,1,0,1,2,1,1};

        int i =0;//0
        int j =arr.length-1; //2
        int k = 0;

        while(k<=j){
            if(arr[k]==0){
                int temp = arr[k];
                arr[k]= arr[i];
                arr[i] = temp;

                k++;
                i++;
            }
            else if(arr[k]==1){
                k++;
            }
            else{
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j--;
            }
        }

        for(int ele: arr){
            System.out.println(ele+" ,");
        }
    }
}
