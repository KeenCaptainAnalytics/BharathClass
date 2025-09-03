import java.util.ArrayList;

public class Powerset2 {

    static void helper(int arr[] , int in , ArrayList<Integer> ans)
    {
        System.out.println(ans);
        for(int i=in ;i< arr.length ;i++){
            if( i>in  && arr[i] == arr[i-1]){
                continue;
            }
            ans.add(arr[i]);
            helper(arr, i+1 , ans);
            ans.remove(ans.size()-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2};
        ArrayList<Integer> ans  = new ArrayList<>();
        // sort 
        helper(arr, 0, ans);
    }
}
