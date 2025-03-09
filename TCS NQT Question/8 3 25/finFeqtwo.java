import java.util.Arrays;

public class finFeqtwo {

    public static void main(String arg[]){
        String str = "manyamany";

        findFequency(str);
    }

    private static void findFequency(String str) {

        char arr [] = str.toCharArray();

        Arrays.sort(arr);

        int count = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] == arr[i]){
                count++;
            }
            else{
                System.out.println(arr[i-1] + " -> " + count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length-1] + " -> " + count);
    }
}
