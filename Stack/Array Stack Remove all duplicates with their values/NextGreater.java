public class NextGreater {

    public static void nextGreater(int arr[]){
        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            for (int j = i; j < arr.length; j++) {
                if(max < arr[j]){
                    result[i] = arr[j];
                    break;
                }
                else{
                    result[i] = -1;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+ " ");
        }
    }
    
    public static void main(String arg[]){
        int arr[] = {1,3,2,1,8,6,3,4};

        nextGreater(arr);
    }
}
