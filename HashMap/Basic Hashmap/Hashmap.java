import java.util.HashMap;
import java.util.Map;

public class Hashmap{

    public static void main(String arg[]){
        Map<String, Integer> mp = new HashMap<>();
        mp.put("shyam", 12);
        mp.put("Ganesh", 24);
        mp.put("Pratik", 22);    // add the values
        mp.put("Jaydev", 15);
        mp.put("Priyanshu", 16);

        System.out.println(mp);

        mp.remove("shyam"); //remove the values

        System.out.println(mp);

        System.out.println(mp.containsKey("ram"));  //true,false

        mp.putIfAbsent("jaydev", 27);  // if not present than add 

        for(var e : mp.entrySet()){
            System.out.printf("The data of %s will be %d \n", e.getKey(), e.getValue());   //key values pair
        }

        for(var key : mp.keySet()){
            System.out.println(key);  //get keys of all haspmap
        }

        for (var elem : mp.keySet()){
            System.out.println(mp.get(elem));  //get values of all hasmap
        }

    }
}