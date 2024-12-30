public class PracticeThree {
    public static void CountNumber(int sr, int sc, int er, int ec, String str, boolean[][] isVisisted){

        if(sr > er || sc > ec) return;
        if(sr < 0 || sc < 0) return;

        if(isVisisted[sr][sc] == true) return;
        if(sr == er && sc == ec){
            System.out.println(str);
            return;
        }
        
        isVisisted[sr][sc] = true;
        // left move
        CountNumber(sr, sc-1, er, ec, str+"L",isVisisted);
        // right move
        CountNumber(sr,sc+1,er,ec,str+"R",isVisisted);
        // down move
        CountNumber(sr+1,sc,er,ec,str+"D",isVisisted);
        // Upper move
        CountNumber(sr-1, sc, er, ec, str+"U",isVisisted);

        isVisisted[sr][sc] = false;
    }

    public static void main(String arg[]){
        int row = 3;
        int cols = 3;
        String val = "";

        boolean[][] isVisited = new boolean[row][cols];

        CountNumber(0,0,row-1,cols-1,val,isVisited);
    }
}
