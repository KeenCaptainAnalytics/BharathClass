import java.util.ArrayList;

public class PalindromicPart {
    static boolean isAPalindrome(String a){
        if(a.length() == 1){
            return true;
        }

        for(int i =0 , j= a.length()-1 ;i<j; i++, j--){
            if(a.charAt(i)==a.charAt(j)){
                continue;
            }
            else{
                return false;
            }
        }

        return true;
    }

    static void helper(ArrayList<String> ans , String option){

        if(option.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<option.length() ;i++){
            if(isAPalindrome(option.substring(0, i+1))){
                ans.add(option.substring(0, i+1));
                helper(ans , option.substring(i+1));
                ans.remove(ans.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        String option = "abaaca";
        ArrayList<String> ans  = new ArrayList<>();

        helper(ans , option);

    }
}
