public class PreficSum{
    // public static int[] Prfix(int arr[]){
    //     int n = arr.length;
    //     int Pref[] = new int[n];

    //     Pref[0] = arr[0];

    //     for (int i = 1; i < n; i++) {
    //         Pref[i] = Pref[i-1] + arr[i];
    //     }
    //     return Pref;
    // }

    public static int totalSum(int arr[]){
        int n = arr.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean FindPreSuf(int arr[]){
        int n = arr.length;
        int PrefSum = 0;
        int totalSum = totalSum(arr);

        for (int i = 0; i < n; i++) {
            PrefSum += arr[i];
            int SuffixSum = totalSum - PrefSum;
            if(PrefSum == SuffixSum){
                return true;
            }
        }
        return false;
        }

    public static void main(String args[]){
        int arr[] = {1,2,3,3,2,1};
        // int Pref[] = Prfix(arr);
        boolean result = FindPreSuf(arr);
        System.out.println(result);

        // for (int i = 0; i < Pref.length; i++) {
        //     System.out.print(Pref[i] + ", ");
        // }
        // System.out.println();

        // int L = 2;
        // int R = 5;
        // int ans = Pref[R] - Pref[R-L];
        // System.out.println(ans);
    }
}