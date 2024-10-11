import java.util.Scanner;
public class prefixAddition{
    public static void prefixSum(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;
        
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j-1];
            }
        }
    }

    public static void Printvalue(int arr[][], int r1, int c1, int r2, int c2){

        int sum = 0;
        prefixSum(arr);


        for (int i = r1; i <= r2; i++) {
            if(c1 > 0){
                sum += arr[i][c2] - arr[i][c1 - 1];
            }else{
                sum += arr[i][c2];
            }
            
        }
        System.out.println("The sum of coordinate " + (r1)+","+(c1)+ " and " + (r2)+","+(c2) + " is  : "+sum);
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of row: ");
        int r = sc.nextInt();
        System.out.print("enter the value of column : ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("enter the matrix value: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("enter the value of coordinate r1 : ");
        int r1 = sc.nextInt();
        System.out.print("enter the value of coordinate c1 : ");
        int c1 = sc.nextInt();
        System.out.print("enter the value of coordinate r2 : ");
        int r2 = sc.nextInt();
        System.out.print("enter the value of coordinate c2 : ");
        int c2 = sc.nextInt();

        Printvalue(arr, r1, c1, r2, c2);

    }
}