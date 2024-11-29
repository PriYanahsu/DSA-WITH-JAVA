public class ThreeValSort{
    static void swap(int arr[], int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }

    public static void Sort(int arr[]){
        
        int sidx = 0;
        int mididx = 0;
        int eidx = arr.length-1;

        while(mididx <= eidx){
            if(arr[mididx] == 0){
                swap(arr, mididx, sidx);
                mididx++;
                sidx++;
            }else if(arr[mididx] == 1){
                mididx++;
            }else if(arr[mididx] == 2){
                swap(arr, mididx, eidx);
                eidx--;
            }
        }
    }

    public static void main(String args[]){
        int arr[] ={0,1,2,0,1,1,0,0,2,2};
        Sort(arr);

        for(int val : arr){
            System.out.println(val);
        }
    }
}