public class findSum {

    public static void main(String arg[]){

        int number = 99;
        int times = 3;
        int sum = 0;

        while(number > 0){
            int digit = number%10;
            sum += digit;
            number /= 10;
        }

        int res = 0;
        for(int i=1; i<times; i++){
            res += sum;
        }

        int ans = 0;
        while(res > 0){
            int digit = res % 10;
            ans += digit;
            res /= 10;
        }

        System.out.println(ans);
    }
}
