public class countSortStable{

    static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void count(int arr[]){
        int maxVal = findMax(arr);
        int count[] = new int[maxVal + 1];
        int output[] = new int[arr.length];

        //for frequency array
        for (int i = 0; i < arr.length; i++) {   //TC -> n times
            count[arr[i]]++;   //This Frequency array in which all values are essentially 0 after count++ it will increase and asign the Value
        }

        //For prefix Sum array
        for (int i = 1; i < count.length; i++) {    //TC -> max time
            count[i] += count[i-1];
        }

        //Sort the array inside another array (Output array)
        for (int i = arr.length-1; i >= 0; i--) {   // TC -> n times
            int idx = count[arr[i]] - 1;            //Here we find the index of output array for the last element of unsorted array
            output[idx] = arr[i];
            count[arr[i]]--;                         //after initializing the value We decrease the idx for future numbers
        }

        for(int i = 0; i<arr.length; i++){          //TC -> n times
            arr[i] = output[i];
        }
    }

    public static void printArr(int arr[]){

        for(int Val: arr){
            System.out.println(Val);
        }
    }

    public static void main(String arg[]){
        int arr[] = {5,3,2,1,6,7};
        count(arr);
        printArr(arr);
    }
}