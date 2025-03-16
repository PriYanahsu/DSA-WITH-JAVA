import java.util.Arrays;

public class duplicatesEle {


    public static void main(String arg[]){

        int arr[] = {1,1,2,4,5,7,7,8,8,9,9};

        int n = arr.length;

        int j = 0;
        for(int i=1; i<n; i++){
            if(arr[i-1] != arr[i]){
                arr[++j] = arr[i];
            }
        }

        arr = Arrays.copyOf(arr, j+1);

        for(int a : arr){
            System.out.print(a+ ", ");
        }
    }
}
