public class findOddCharSumAschii {

    public static void main(String arg[]){
        String str = "priyanshu";
        int n = str.length();
        int sum = 0;

        for(int i=1; i<n; i=i+2){
            int curr = str.charAt(i);
            System.out.println(i + " -> "+ curr);
            sum+=curr;
        }

        if(sum%2==0) System.out.println("The number sum is even "+ sum);
        else System.out.println("The number sum is odd " + sum);
    }
}
