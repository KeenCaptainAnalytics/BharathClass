public class Lettercomb {

    static void helper(String option[], String num, String ans, int in){
       if(in == num.length()){
        System.out.println(ans);
        return;
       }
       
        int digit = num.charAt(in) - 48;
        String temp = option[digit]; 

        for(int i=0 ;i< temp.length() ;i++){
            helper(option, num, ans+temp.charAt(i), in+1);
        }
        //'5' = > 53
        // '0' => 48 '1' = 49, '2' = 50 , 51=> '3' 52 => '4'
         // '2' = >  '2' -48  50-48 => 2
        // '5' = > '5' -48 => 53 - 48 = > 5
    }
    public static void main(String[] args) {
        String option[]= {null, null ,"abc","def", "ghi","jkl","mno","pqrs", "tuv","wxyz" };
        String num ="46";
        
        helper(option, num,"", 0 );
    }
}
