import java.util.Scanner;
public class frequency {

    public static void frequenc(int arr[], int x){
        int frequent[] = new int[1025];

        for (int i = 0; i < arr.length; i++) {
            frequent[arr[i]]++;
        }
        
        if(frequent[x] == 0){
            System.out.println("Not Found");
        }else{
            System.err.println("Found");
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,25,7,57,6,9,10};
        int Data = sc.nextInt();
        frequenc(arr, Data);
    }
}
