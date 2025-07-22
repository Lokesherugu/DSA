import java.util.HashMap;

public class hashMapOperations {
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();
        //get
        map.put("apple", 9);
        map.put("mango", 10);
        map.put("Banana", 11);

        // put
        System.out.println(map.get("apple"));

        //containsKey
        System.out.println(map.containsKey("apple"));

        //contains value
        System.out.println(map.containsValue(9));

        //keySet, values
        System.out.println(map.keySet());
        System.out.println(map.values());

        //remove
        map.remove("apple", 9);
        System.out.println(map.keySet());
        System.out.println(map.values());

      // size,isEmpty, getOrDefault, putifAbsent, clear  

      //size
      System.out.println(map.size());

      //isEmpty
      System.out.println(map.isEmpty());

      //getOrDefault
      System.out.println(map.getOrDefault("orange", 0));

      System.out.println(map.entrySet());

      // putIfAbsent
      map.putIfAbsent("orange", 12);
      map.replace("mango", 22);
      System.out.println(map.entrySet());




        }
    
}
