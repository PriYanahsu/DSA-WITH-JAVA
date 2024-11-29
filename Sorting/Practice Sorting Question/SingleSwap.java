public class SingleSwap{
    public static int First = -1;
    public static int Last = -1;
    public static void Single(int arr[]){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if(arr[i-1] > arr[i]){
                if(First == -1){      //First error check
                    First = i-1;
                }else{
                    Last = i;        //Last error check
                }
            }
        }

        int temp = arr[First];
        arr[First] = arr[Last];
        arr[Last] = temp;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,5,10,8,9,6};
        Single(arr);

        for(int val: arr){
            System.out.println(val);
        }
    }
}