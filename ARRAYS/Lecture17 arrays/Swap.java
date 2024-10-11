public class Swap{
    public static void PrintSwap(int a, int b){

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a = " + a + ", b = "+ b);
    }

    public static void main(String arg[]){
        int a = 5;
        int b =7;
        PrintSwap(a, b);
    }
}