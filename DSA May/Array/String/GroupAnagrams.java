package String;

import java.util.*;

public class GroupAnagrams {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        System.out.print("Enter the size of the values : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.next();
        }

        System.out.println(findGroups(arr).toString());
    }

    private static List<List<String>> findGroups(String[] strs) {

        HashMap<String, ArrayList<String>> value = new HashMap<>();

        for(String str : strs){

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            value.putIfAbsent(key, new ArrayList<>());
            value.get(key).add(str);
        }
        return new ArrayList<>(value.values());
    }
}
