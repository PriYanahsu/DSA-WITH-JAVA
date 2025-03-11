public class sumStringDigit {

    public static void main(String arg[]){
        String str = "abcd128nuu45";

        System.out.println(findSum(str));
    }

    private static int findSum(String str) {

        int sum = 0;

        for(char curr : str.toCharArray()){
            if(Character.isDigit(curr)){
                sum += (curr - '0');
            }
        }
        return sum;
    }
}
