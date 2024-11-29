import java.util.ArrayList;

public class returnarr{
    static ArrayList<Integer> Allindices(int arr[], int n, int x, int idx){
        if(idx >= n){
            return new ArrayList<Integer>();
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(arr[idx] == x){
            ans.add(idx);
        }

        ArrayList<Integer> Smallest = Allindices(arr, n, x, idx+1);
        ans.addAll(Smallest);
        return ans;
    }

    public static void main (String args[]){
        int arr[] = {1,2,2,7,8,2};
        int n = arr.length;
        int x = 2;
        int idx = 0;
        ArrayList<Integer> ans = Allindices(arr, n, x, idx);

        for(int an : ans){
            System.out.println(an);
        }
    }
}