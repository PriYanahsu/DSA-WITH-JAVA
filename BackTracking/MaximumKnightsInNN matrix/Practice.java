public class Practice{
    static int maxKnights = -1;  // to find max number of knights
    static int number = 3;       // only print 3 number of knights matrix

    public static boolean isSafe(char board[][], int row, int col){
        int n = board.length;
        int i,j;

        //top-2 right-1
        i = row-2;
        j = col+1;
        if(i>=0 && j<n && board[i][j] == 'K') return false;

        //top-2 left-1
        i = row-2;
        j = col-1;
        if(i>=0 && j>=0 && board[i][j] == 'K') return false;

        //down-2 right-1
        i = row+2;
        j = col+1;
        if(i<n && j<n && board[i][j] == 'K') return false;

        //down-2 left-1
        i = row+2;
        j = col-1;
        if(i<n && j>=0 && board[i][j] == 'K') return false;

        //right-2 top-1
        i = row-1;
        j = col+2;
        if(i>=0 && j<n && board[i][j] == 'K') return false;

        //right-2 down-1
        i = row+1;
        j = col+2;
        if(i<n && j<n && board[i][j] == 'K') return false;

        //left-2 top-1
        i = row-1;
        j = col-2;
        if(i>=0 && j>=0 && board[i][j] == 'K') return false;

        //left-2 down-1
        i = row+1;
        j = col-2;
        if(i<n && j>=0 && board[i][j] == 'K') return false;

        return true;
    }

    public static void helper(char board[][], int row, int cols, int num){
        int n = board.length;

        if(row == n){
            // if(num == number){                           only print number of knights
            //     for (int i = 0; i < n; i++) {
            //         for (int j = 0; j < n; j++) {
            //             System.out.print(board[i][j]);
            //         }
            //         System.out.println();
            //     }
            //     System.out.println();
            // }
            // return;
            maxKnights = Math.max(maxKnights, num);
            return;
        }
        else if(isSafe(board, row, cols)){
            board[row][cols] = 'K';
            if(cols!=n-1) helper(board, row, cols+1, num+1);
            else helper(board, row+1, 0, num+1);
            board[row][cols] = '.';
        }

        if(cols!=n-1) helper(board, row, cols+1, num);
        else helper(board, row+1, 0, num);
    }

    public static void main(String arg[]){
        int n = 3;
        char board[][] = new char[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        helper(board, 0, 0, 0);
        System.out.println(maxKnights);
    }
}