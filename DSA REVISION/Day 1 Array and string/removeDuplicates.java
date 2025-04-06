import java.util.Arrays;

public class removeDuplicates {

    public static void main(String arg[]){

        int arr[] = {1,2,5,5,7,7,8,9};
        int n = arr.length;
        int z = 0;

        for(int i=1; i<n; i++){
            if(arr[i-1] != arr[i]){
                arr[++z] = arr[i];
            }
        }

        arr = Arrays.copyOf(arr, z+1);
        for(int a: arr){
            System.out.print(a + ", ");
        }
    }
}
