public class max2ndmax{
    public static int Maxprint(int arr[]){

        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];oewejsa
            }
        }
        return max;
    }

    public static int SecondMax(int arr[]){
        int max = Maxprint(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
            int secondmx = Maxprint(arr);
        return secondmx;
    }
    public static void main(String[] args) {
        int []arr = {5,2,7,8,12};
        System.out.println(Maxprint(arr));
        System.out.println(SecondMax(arr));
    }
}
