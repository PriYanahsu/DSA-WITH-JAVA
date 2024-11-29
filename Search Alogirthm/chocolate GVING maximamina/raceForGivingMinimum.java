public class raceForGivingMinimum{
    static boolean isPossible(int a[], int k, int minDistance){

        int kidsPlaced = 1;
        int lastKid = a[0];

        for (int i = 1; i < a.length; i++) {
            if(a[i] - lastKid >= minDistance){
                kidsPlaced++;
                lastKid = a[i];
            }
        }

        // if(kidsPlaced < minDistance) return false;
        // return true;
        
        return (kidsPlaced >= minDistance);
    }

    public static int FindMid(int a[], int k){
        if(k > a.length) return -1;

        int start = 0;
        int end = (int) 1e9;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(isPossible(a, k, mid)){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int a [] = {1,2,4,8,9};
        int k = 3;
        System.out.println(FindMid(a, k));
    }
}