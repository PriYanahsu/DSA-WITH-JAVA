public class mergeSort{
    public static void conquer(int arr[], int S, int mid, int E) {
        
        int merge[] = new int[E-S+1];

        int idx1 = S;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= E){
            if(arr[idx1] <= arr[idx2]){
                merge[x++] = arr[idx1++];
            }else{
                merge[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid){
            merge[x++] = arr[idx1++];
        }
        while(idx2 <= E){
            merge[x++] = arr[idx2++];
        }

        for(int i = 0; i < merge.length; i++) {
            arr[S+i] = merge[i];
        }
    }

    public static void divide(int arr[], int S, int E){
        if(S >= E) return;

        int mid = (S+E)/2;
        divide(arr, S, mid);
        divide(arr, mid+1, E);
        conquer(arr, S, mid, E);
    }

    public static void main(String arg[]){
        int arr[]= {2,1,7,6,3,9};
        int E = arr.length-1;
        int S = 0;
        divide(arr,S,E);


        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}