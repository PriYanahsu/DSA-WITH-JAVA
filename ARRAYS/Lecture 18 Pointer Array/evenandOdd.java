public class evenandOdd {
    public static void Seprate(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i<j){
            if(arr[i] % 2 == 1 && arr[j] % 2 == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            if(arr[i] % 2 == 0){
                i++;
            }

            if(arr[j] % 2 == 1){
                j--;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+ ", ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {2,1,7,5,4,6,9};
        Seprate(arr);
    }
}
