import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hashmap{

    public static Map<String, String> reverseHashMap(Map<String, String> map){

        Map<String, String> reversedMap = new HashMap<>();

        for(var val : map.entrySet()){
            reversedMap.put(val.getValue(), val.getKey());
        }
        return reversedMap;
    }

    public static Map<String, String> FindCorrect(HashMap<String, String> map){

        Map<String, String> result = new LinkedHashMap<>();
        Map<String, String> reversedMap = reverseHashMap(map);
        String start = null;

        for(String val: map.keySet()){
            if(!reversedMap.containsKey(val)){
                start = val;
            }
        }

        while(start!=null && map.containsKey(start)){
            String next = map.get(start);
            result.put(start,next);
            start = next;
        }
        return result;
    }

    public static void main (String arg[]){
        HashMap<String, String> map = new HashMap<>();

        map.put("Chennai", "Banglore");
        map.put("Bombay", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        System.out.println(FindCorrect(map));
    }
}