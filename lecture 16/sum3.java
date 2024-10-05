public class sum3 {
    public static void main(String args[]){
        
        int arr[] = {3,6,5,4,1};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                for (int k = j+1; k < arr.length; k++){
                    if(arr[i]+arr[j]+arr[k] == 12){
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
