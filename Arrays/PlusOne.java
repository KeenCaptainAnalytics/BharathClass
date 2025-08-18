class Solution {
    public int[] plusOne(int[] arr) {
        int i = arr.length-1;

        int carry =0;
        boolean flag = false; // array size
        while(i>=0 ){
            
            arr[i] = arr[i]+1;
            if(arr[i] >9){
                arr[i] = arr[i]%10;
                carry=1;
            }
            else{
                carry=0;
            }
            
            if(carry==0){
                break;
            }
            if(carry==1 && i == 0 ){
                flag = true;
            }
            i--;
        }
         
         if(flag ==true){
            int nums[] = new int[arr.length+1];
            nums[0]= 1;
            return nums;
         }
         return arr;
    }
}



// int = > 100
// class Solution {
//     public int[] plusOne(int[] digits) {
//         long ans= 0;
//         for(int i=0;i< digits.length ;i++){
//             ans= ans*10 + digits[i];
//         }

//         // System.out.println(ans);
//         ans = ans+1;
//         //  System.out.println(ans);
       
//        ArrayList<Integer> list = new ArrayList<>();
//        while(ans!=0){
//         int d = (int)(ans%10);
//         list.add(d);
//         ans = ans/10;
//        }
//     //    System.out.println(ans);

//        int answer [] = new int[list.size()];
//        int j= list.size()-1;
       
//        for(int i=0;i< list.size();i++){
        
//         answer[i] =list.get(j);
//         j--;
//        }

//        return answer;
//     }
// }
