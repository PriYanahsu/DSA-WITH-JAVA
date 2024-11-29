public class Countsort{
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

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;   //This Frequency array in which all values are essentially 0 after count++ it will increase and asign the Value
        }

        int k = 0;
        for (int i = 0; i < count.length; i++) {    //This is for count array Transverse
            for (int j = 0; j < count[i]; j++) {    //Here we run 2 value for 2 times
                arr[k++] = i;
            }
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