import java.util.ArrayList;
import java.util.Scanner;

public class PascelTriangle {

    public static void main (String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        DrawPascel(n);
    }

    private static void DrawPascel(int n) {

        ArrayList<ArrayList<Integer>> pascel = new ArrayList<>();

        for(int i=0; i<n; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) row.add(1);
                else{
                    int sum = pascel.get(i-1).get(j) + pascel.get(i-1).get(j-1);
                    row.add(sum);
                }
            }
            pascel.add(row);
        }

        System.out.println(pascel.toString());
    }
}
