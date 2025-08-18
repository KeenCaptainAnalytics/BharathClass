class Test{
    public static void main(String[] args) {
        // declaration + init
        int arr[] = {0,0,1,1,0,0,1,1,0,0};

        // j =zeroes i =>traversal
        for(int i=0, j=0;i<arr.length ;i++ ){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;

                j++;
            }
        }

        // counting 0

        // int count =0;
        // for(int i =0;i<arr.length ;i++){
        //     if(arr[i]==0){
        //         count++;
        //     }
        // }

        // for(int i=0;i<arr.length ;i++){
        //     if(count>0){
        //         count= count-1;
        //         arr[count] = 0;
        //     }
        //     else{
        //         arr[i]= 1;
        //     }
        // }

        for(int ele : arr){
            System.out.print(ele+" ,");
        }
    }
}