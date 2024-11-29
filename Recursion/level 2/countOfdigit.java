public class countOfdigit {
    public static int count(int n){
        if(n >= 0 && n <= 9){
            return 1;
        }

        return 1 + count(n / 10);
    }
    public static void main(String args[]){
        System.out.println(count(12345));
    }
}
