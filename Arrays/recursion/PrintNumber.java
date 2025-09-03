public class PrintNumber {

    static void printNum(int num){
        if(num ==4){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        printNum(num +  1 );
        System.out.println(num);
    }
    public static void main(String[] args) {
      
        printNum(1);
    }
}
