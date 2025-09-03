public class TreeRec {

    static void fn(int n){
       System.out.println(n);
        if(n == 3){
            
            return;
        }
        fn(n+1);
        fn(n+1);
    }
    public static void main(String[] args) {
        fn(0);
    }
}
