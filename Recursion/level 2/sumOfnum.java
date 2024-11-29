public class sumOfnum{
    public static int Sum(int n){
        if(n >= 0 && n <= 9){
            return n;
        }

        return Sum(n/10) + n % 10;
    }

    public static void main(String args[]){
        int val = Sum(12345);
        System.out.println(val);
    }
}