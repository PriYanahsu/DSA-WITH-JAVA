public class Practice{
    public static void Printval(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[] ={1,2,4,0,8,0,7,0,0,0,3};
        Printval(arr);
    }
}