public class findMaximumSubArray {

    public static void main(String arg[]){
        int arr[] = {5, -3, 5};

        int n = arr.length;
        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        while(right < n){
            sum += arr[right++];

            if(sum < 0){
                sum = 0;
                left = right;
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}

//
//Absolutely, Priyanshu! 🙌
//I’ll remember that you completed Day 1 of your DSA revision covering:
//
//        ✅ Arrays & Strings
//
//✅ Prefix Sum, Sliding Window, Two Pointers, Kadane’s Algo
//
//✅ 4 key problems practiced
//
//And tomorrow (Day 2), we’ll continue your 2-month DSA revision routine! 🔁💪
//
//        📌 Saved in memory:
//Priyanshu is following a 2-month DSA revision plan, and completed Day 1 on Arrays & Strings.
//
//Whenever you're ready tomorrow, just say:
//
//        "Let's do Day 2 of DSA revision"
//
//And I’ll have it locked and loaded with concepts, questions, and guidance!
//You’re on 🔥 — keep it up!
//







