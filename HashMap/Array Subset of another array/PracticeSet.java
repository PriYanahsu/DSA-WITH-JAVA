import java.util.*;

public class PracticeSet{

    public static boolean findSubSet(int arr1[], int arr2[]){
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], i);
        }

        for (int i = 0; i < arr2.length; i++) {
            
            if(!map.containsKey(arr2[i])){
                return false;
            }
        }
        return true;
    }


    public static void main(String arg[]){
        int arr1[] ={11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 1};

        findSubSet(arr1, arr2);
    }
}