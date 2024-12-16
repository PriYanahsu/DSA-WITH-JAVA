import java.util.HashMap;
import java.util.LinkedList;

public class Practice{

    public static LinkedList<Integer> findUnion(LinkedList<Integer> l1, LinkedList<Integer> l2){
        LinkedList<Integer> Result = new LinkedList<>();

        for(Integer I : l1){
            if(!Result.contains(I)){
                Result.add(I);
            }
        }

        for(Integer I : l2){
            if(!Result.contains(I)){
                Result.add(I);
            }
        }
        return Result;
    }

    public static LinkedList<Integer> findIntersection(LinkedList<Integer> l1, LinkedList<Integer> l2){
        LinkedList<Integer> list3 = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer I : l1){
            map.put(I, 1);
        }

        // for (var elem : map.values()) {
        //     System.out.print(elem + " ");
        // }
        // System.out.println();

        for(Integer L : l2){
            if(map.containsKey(L)){
                list3.add(L);
            }
        }
        return list3;
    }

    public static void main(String arg[]){
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(10);
        list1.add(15);
        list1.add(4);
        list1.add(20);

        list2.add(8);
        list2.add(4);
        list2.add(2);
        list2.add(10);

        System.out.println(findUnion(list1, list2));
        System.out.println(findIntersection(list1, list2));
    }
}
