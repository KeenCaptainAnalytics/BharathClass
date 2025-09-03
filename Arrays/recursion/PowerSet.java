import java.util.ArrayList;

public class PowerSet {

    static void powersetHelper(String option , ArrayList<Character> ans, int in,ArrayList<ArrayList<Character>> finalAnsList){
        if(in == option.length()){
             ArrayList<Character> temp = new ArrayList<>(ans);
             finalAnsList.add(temp);
            // System.out.println(ans);
            return ;
        }
        ans.add(option.charAt(in));
        powersetHelper(option, ans, in+1,finalAnsList );
        // ans =""
        ans.remove(ans.size()-1);
        powersetHelper(option, ans, in+1, finalAnsList);
    }
    public static void main(String[] args) {
        String option = "abc";
        ArrayList<Character> ans = new ArrayList<>();
        ArrayList<ArrayList<Character>> finalAnsList = new ArrayList<ArrayList<Character>>();
        powersetHelper(option, ans, 0, finalAnsList);
        System.out.println(finalAnsList);
    }
}
