import java.util.ArrayList;
import java.util.List;

public class nQueen {

    public static void main(String arg[]){
        int n = 4;
        findNQueen(n);
    }

    private static void findNQueen(int n) {

        char[][] board = new char[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        findQ(board, 0, ans);
        System.out.print(ans);
    }

    private static void findQ(char[][] board, int row, List<List<String>> ans){
        int n = board.length;

        if(row == n){
            List<String> l = new ArrayList<>();
            for(int i=0; i<n; i++) {
                String str = "";
                for (int j = 0; j < n; j++) {
                    str += board[i][j];
                }
                l.add(str);
            }
            ans.add(l);
            return;
        }

        for(int j=0; j<n; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                findQ(board, row+1, ans);
                board[row][j] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int cols) {

        int n = board.length;

        // rows
        for(int i=0; i<n; i++){
            if(board[i][cols] == 'Q') return false;
        }

        // cols
        for(int j=0; j<n; j++){
            if(board[row][j] == 'Q') return false;
        }

        //North-East
        int i = row;
        int j = cols;
        while(i>=0 && j<n){
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }

        // North-West
        i=row;
        j=cols;
        while(i>=0 && j>=0){
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }

        //South-East
        i=row;
        j=cols;
        while(i<n && j<n){
            if(board[i][j] == 'Q') return false;
            i++;
            j++;
        }

        //South-West
        i=row;
        j=cols;
        while(i<n && j>=0){
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }

        return true;
    }
}

