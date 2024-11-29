public class bubble{
    public static int[] bub(int arr[]){

        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for (int j = 0; j < n-1-i; j++) {
                
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false) {
                return arr;
            }
        }
        return arr;
    }

    public static void main(String arg[]){
        int arr[] = {5,4,7,3,1};
        int arr2[] = bub(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+ ", ");
        }
    }
}