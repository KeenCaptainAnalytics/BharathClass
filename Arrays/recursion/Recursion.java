public class Recursion {

    static void print(int n ){
        if(n ==4){
            return;
        }
        // return means => dont execute anything
        //  which is beneath this return  
        System.out.println("hello world");
        print(n+1);
    }
    public static void main(String[] args) {

        print(1);
        // Q2; 
        // 1 2 3 4 5 4 3 2 1

        // n is 5
        // print 1to 5
        // 1 2 3 4 5 = > usign recursion 

        // first output makes up your next input
    }
}
