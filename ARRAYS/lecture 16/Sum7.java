public class Sum7{

    public static void main(String[] args) {
        int arr[] = {4,6,3,5,8,2};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int Val = arr[i] + arr[j];
                if(Val == 7){
                    sum++;
                }
            }
        }
        System.out.println("The number of values are whose sum is 7 are : "+ sum);
    }
}