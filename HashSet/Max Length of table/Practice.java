import java.util.HashSet;

public class Practice{
    public static int maxLength(int arr[]){
        int n = arr.length;
        int maxLength = 0;
        HashSet<Integer> table = new HashSet<>();

        for(int i=0; i<n; i++){
            int val = arr[i];
            if(table.contains(val)){
                table.remove(val);
            }
            else{
                table.add(val);
                maxLength = Math.max(maxLength, table.size());
            }
        }
        return maxLength;
    }

    public static void main(String arg[]){
        int arr[] = {2,1,1,3,2,3};
        System.out.println(maxLength(arr));
    }
}