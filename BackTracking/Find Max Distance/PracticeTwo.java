public class PracticeTwo {
    public static void CountNumber(int sr, int sc, int er, int ec, String str){
        if(sr > er || sc > ec){
            return;
        }

        if(sr == er && sc == ec){
            System.out.println(str);
            return;
        }
        

        // right move
        CountNumber(sr,sc+1,er,ec,str+"R");
        // down move
        CountNumber(sr+1,sc,er,ec,str+"D");

    }

    public static void main(String arg[]){
        int row = 2;
        int cols = 2;
        String val = "";

        CountNumber(1,1,row,cols,val);
    }
}
