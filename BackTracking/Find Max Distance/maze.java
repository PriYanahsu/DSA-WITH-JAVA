public class maze {
        public static void CountNumber(int sr, int sc, int er, int ec, String str, int[][] maze){
    
            if(sr > er || sc > ec) return;
            if(sr < 0 || sc < 0) return;
            if(sr == er && sc == ec){
                System.out.println(str);
                return;
            }

            if(maze[sr][sc] == 0) return;
            if(maze[sr][sc] == -1) return;
            
            maze[sr][sc] = -1;
            // left move
            CountNumber(sr, sc-1, er, ec, str+"L",maze);
            // right move
            CountNumber(sr,sc+1,er,ec,str+"R",maze);
            // down move
            CountNumber(sr+1,sc,er,ec,str+"D",maze);
            // Upper move
            CountNumber(sr-1, sc, er, ec, str+"U",maze);
    
            maze[sr][sc] = 1;
        }
    
        public static void main(String arg[]){
            int row = 3;
            int cols = 4;
    
            int[][] maze = {
                {1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}
            };
    
            CountNumber(0,0,row-1,cols-1,"",maze);
        }
    
}
