public class NQueen {

    static  boolean check(int [][]board, int row, int col){
        for(int i=row-1; i>=0;i--){
            if(board[i][col]==1){
                return false;
            }
        }
        // left diagon al
        for(int i=row, j=col ; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        // right diagonal
        for(int i=row, j=col;i>=0 && j<=board[0].length-1; i--,j++){
            if(board[i][j] ==1){
                return false;
            }
        }
        return true;
    }
    static boolean helper(int board[][] , int q){
        if(q == board.length){

            return true;
        }
        // [q][0] [q][1] [q][2] [q][3]

        // columns
        for(int i=0 ;i<board[0].length; i++){
            if(check(board, q, i)==true){
                board[q][i] = 1;
                if(helper(board, q+1)== false){
                    board[q][i] =0;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 4;
        int [][] board = new int[n][n];

        helper(board, 0);

        for(int i=0;i<n;i++){
            for(int j =0;j<n ;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
