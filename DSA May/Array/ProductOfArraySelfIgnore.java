import java.util.Scanner;

public class ProductOfArraySelfIgnore {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the value of an array -> ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans [] = findAnswer(arr);

        for(int a : ans) System.out.print(a + ", ");

    }

    private static int[] findAnswer(int[] arr) {

        // this is not able to handle zero

//        int pre = 1;
//
//        for(int i=0; i<arr.length; i++){
//            pre *= arr[i];
//        }
//
//        for(int i=0; i<arr.length; i++){
//            arr[i] = pre / arr[i];
//        }

        int [] output = new int[arr.length];
        output[0] = 1;

        // prefix product
        for(int i=1; i<arr.length; i++){
            output[i] = output[i-1] * arr[i-1];
        }

        int suffix = 1;
        for(int i=arr.length-1; i>=0; i--){
            output[i] *= suffix;
            suffix *= arr[i];
        }

        return output;
    }
}
