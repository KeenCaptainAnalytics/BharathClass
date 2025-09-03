public class AddDigits {
    // one recursive call = > solve on subproblem

    static void sumOfDigits(int num , int sum){
            
            if(num == 0){
                System.out.println(sum);
                return; // stop the algo
            }

            int digit = num%10;
            sum = sum +digit;
            num = num/10;

            sumOfDigits(num, sum);
    }
    public static void main(String[] args) {
        int num = 2536;
        sumOfDigits(num, 0);       
    }
}
