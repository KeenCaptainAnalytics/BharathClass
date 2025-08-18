public class Patterns {
    public static void main(String[] args) {


        for(int i=0;i<5 ;i++){
            for(int j=0;j<5;j++){

                int diff = i-j ;
                diff= diff<0?diff*(-1) : diff;

                if(diff <=2 && !((i+j)<2) && !((i+j)>6) ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

        //    *
        //   **
        //  ***
        // ****
        // row  stars  spaces
            // 0     1   3        f(row) = row+1
            // 1     2   2        f(row) = n  -1-row
            // 2     3   1 
        // int n = 4;
        // for(int i =0 ;i < n ; i++){
        //     for(int sp = 0 ; sp< n-1-i ; sp++){
        //         System.out.print(" ");
        //     }
        //     //  0 1 2 3
        //     for(int j =0 ; j< i+1 ;j++){
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }
    }
}
