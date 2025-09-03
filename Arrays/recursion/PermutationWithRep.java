public class PermutationWithRep {
    static void helper(String option , String ans){
        if(ans.length() == 3){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<option.length() ;i++){
            helper(option, ans+option.charAt(i));
        }

        // helper(option, ans+option.charAt(0));
        // helper(option, ans+option.charAt(1));
        // helper(option, ans+option.charAt(2));
    }
    public static void main(String[] args) {
        helper("abcd", "");
    }
}
