public class Practice{
    public static int CountNumber(int sr, int sc, int er, int ec){
        if(sr > er || sc > ec) return 0;
        if (sr == er && sc == ec) return 1;

        // right move
        int rightWays = CountNumber(sr,sc+1,er,ec);
        // down move
        int downWays = CountNumber(sr+1,sc,er,ec);

        return rightWays+downWays;
    }

    public static void main(String arg[]){
        int row = 2;
        int cols = 2;

        int count = CountNumber(1,1,row,cols);
        System.out.println("Count " + count);
    }
}